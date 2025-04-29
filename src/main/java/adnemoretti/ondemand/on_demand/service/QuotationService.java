package adnemoretti.ondemand.on_demand.service;

import adnemoretti.ondemand.on_demand.config.FeatureConfig;
import adnemoretti.ondemand.on_demand.dto.request.OrdersRequestDTO;
import adnemoretti.ondemand.on_demand.dto.request.QuotationRequestDTO;
import adnemoretti.ondemand.on_demand.enums.EventTypeEnum;
import adnemoretti.ondemand.on_demand.models.Address;
import adnemoretti.ondemand.on_demand.models.Events;
import adnemoretti.ondemand.on_demand.models.Merchant;
import adnemoretti.ondemand.on_demand.models.Quotation;
import adnemoretti.ondemand.on_demand.repository.AddressRepository;
import adnemoretti.ondemand.on_demand.repository.EventsRepository;
import adnemoretti.ondemand.on_demand.repository.MerchantRepository;
import adnemoretti.ondemand.on_demand.repository.QuotationRepository;
import adnemoretti.ondemand.on_demand.utils.GeolocalUtils;
import org.springframework.web.bind.annotation.RequestBody;

public class QuotationService {
    private final QuotationRepository quotationRepository;
    private final GeolocalUtils geolocalUtils;
    private final MerchantRepository merchantRepository;
    private final AddressRepository addressRepository;
    private final EventsRepository eventsRepository;
    private final FeatureConfig featureConfig;

    public QuotationService(QuotationRepository quotationRepository,
                            GeolocalUtils geolocalUtils,
                            MerchantRepository merchantRepository,
                            AddressRepository addressRepository,
                            EventsRepository eventsRepository,
                            FeatureConfig featureConfig){
        this.quotationRepository = quotationRepository;
        this.geolocalUtils = geolocalUtils;
        this.merchantRepository = merchantRepository;
        this.addressRepository = addressRepository;
        this.eventsRepository = eventsRepository;
        this.featureConfig = featureConfig;

    }

//    public Quotation create(@RequestBody QuotationRequestDTO quotationRequestDTO){
//        Quotation quotation = new Quotation();
//        return quotationRepository.save(quotation);
//    }

    public boolean validateQuotation(OrdersRequestDTO order){

        Address address = addressRepository.findById(order.addressId())
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));

        Merchant merchant = merchantRepository.findById(order.merchantId())
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));

        double distance = geolocalUtils.distance(address, merchant.getAddress());
        if(distance > featureConfig.getMaxRadium()){
            // Publica no kafka que foi recusado e retorna false;
            return false;
        }

        Events event = eventsRepository.findLastEvent()
                .orElseThrow(() -> new IllegalArgumentException("No event registred"));
        if(event.getType() != EventTypeEnum.AVAILABLE){
            return true;
        }
    }



}

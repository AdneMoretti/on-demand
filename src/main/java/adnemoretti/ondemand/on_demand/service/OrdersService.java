package adnemoretti.ondemand.on_demand.service;

import adnemoretti.ondemand.on_demand.dto.request.OrdersRequestDTO;
import adnemoretti.ondemand.on_demand.models.Address;
import adnemoretti.ondemand.on_demand.models.Merchant;
import adnemoretti.ondemand.on_demand.models.Orders;
import adnemoretti.ondemand.on_demand.repository.AddressRepository;
import adnemoretti.ondemand.on_demand.repository.MerchantRepository;
import adnemoretti.ondemand.on_demand.repository.OrdersRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;
    private final MerchantRepository merchantRepository;
    private final AddressRepository addressRepository;

    public OrdersService(OrdersRepository ordersRepository,
                         MerchantRepository merchantRepository,
                         AddressRepository addressRepository) {
        this.ordersRepository = ordersRepository;
        this.merchantRepository = merchantRepository;
        this.addressRepository = addressRepository;
    }

    @Transactional
    public Orders create(OrdersRequestDTO dto) {
        UUID orderId = UUID.randomUUID();

        Merchant merchant = merchantRepository.findById(dto.merchantId())
                .orElseThrow(() -> new IllegalArgumentException("Merchant not found"));

        Address address = addressRepository.findById(dto.addressId())
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));

        Orders order = new Orders();
        order.setId(orderId);
        order.setMerchant(merchant);
        order.setAddress(address);
        order.setPrice(dto.price());
        order.setStatus(dto.status());
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());
        return ordersRepository.save(order);
    }
}

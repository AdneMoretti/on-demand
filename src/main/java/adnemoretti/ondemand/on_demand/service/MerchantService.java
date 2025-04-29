package adnemoretti.ondemand.on_demand.service;
import adnemoretti.ondemand.on_demand.dto.MerchantDTO;
import adnemoretti.ondemand.on_demand.models.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import adnemoretti.ondemand.on_demand.models.Merchant;
import adnemoretti.ondemand.on_demand.repository.MerchantRepository;

import java.util.UUID;

@Service
public class MerchantService {

    private final MerchantRepository merchantRepository;

    public MerchantService(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    @Transactional
    public Merchant create(MerchantDTO merchantDTO, Address address) {
        UUID id = UUID.randomUUID();

        Merchant merchant = new Merchant(id, merchantDTO.name(), merchantDTO.description(), address);
        return merchantRepository.save(merchant);
    }
}
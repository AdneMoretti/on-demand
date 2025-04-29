package adnemoretti.ondemand.on_demand.service;
import adnemoretti.ondemand.on_demand.dto.AddressDTO;
import adnemoretti.ondemand.on_demand.dto.MerchantDTO;
import adnemoretti.ondemand.on_demand.models.Address;
import adnemoretti.ondemand.on_demand.repository.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import adnemoretti.ondemand.on_demand.models.Merchant;
import adnemoretti.ondemand.on_demand.repository.MerchantRepository;

import java.util.UUID;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional
    public Address create(AddressDTO addressDTO) {
        UUID id = UUID.randomUUID();

        Address address = new Address(id, addressDTO.latitude(), addressDTO.longitude());
        Address response = addressRepository.save(address);
        addressRepository.flush();
        return response;
    }

}
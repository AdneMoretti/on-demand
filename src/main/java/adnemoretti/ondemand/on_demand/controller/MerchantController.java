package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.MerchantDTO;
import adnemoretti.ondemand.on_demand.models.Address;
import adnemoretti.ondemand.on_demand.models.Merchant;
import adnemoretti.ondemand.on_demand.service.AddressService;
import adnemoretti.ondemand.on_demand.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @Autowired
    private AddressService addressService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody MerchantDTO merchant){
        Address address = addressService.create(merchant.address());
        Merchant response = merchantService.create(merchant, address);
        System.out.println(response.getDescription());
        return ResponseEntity.ok(response);
    }

}

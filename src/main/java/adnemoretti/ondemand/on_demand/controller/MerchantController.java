package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.MerchantDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody MerchantDTO merchant){
        return ResponseEntity.ok(merchant);
    }

}

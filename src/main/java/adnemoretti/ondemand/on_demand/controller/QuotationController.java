package adnemoretti.ondemand.on_demand.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @PostMapping("/approve")
    public String approve() {
        return "OK";
    }

    @PostMapping("/calculate")
    public String calculate(){ return "OK"; }

}

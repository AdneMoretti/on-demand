package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.request.OrdersRequestDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @PostMapping("/approve")
    public ResponseEntity<?> approve(@RequestBody OrdersRequestDTO ordersRequestDTO) {
        return "OK";
    }

    @PostMapping("/calculate")
    public String calculate(){ return "OK"; }

}

package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.request.ApproveRequestDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @PostMapping("/approve")
    public ResponseEntity<?> validate(@RequestBody final ApproveRequestDTO approveRequest) {
        return "OK";
    }

    @PostMapping("")

}

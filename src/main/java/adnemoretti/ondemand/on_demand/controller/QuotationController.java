package adnemoretti.ondemand.on_demand.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    @PostMapping("/approve")
    public ResponseEntity<?> validate(static ? ) {
        return "OK";
    }

    @PostMapping("")

}

package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.MerchantDTO;
import adnemoretti.ondemand.on_demand.dto.request.OrdersRequestDTO;
import adnemoretti.ondemand.on_demand.models.Address;
import adnemoretti.ondemand.on_demand.models.Merchant;
import adnemoretti.ondemand.on_demand.models.Orders;
import adnemoretti.ondemand.on_demand.service.AddressService;
import adnemoretti.ondemand.on_demand.service.MerchantService;
import adnemoretti.ondemand.on_demand.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrdersService orderService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody OrdersRequestDTO orderDTO){

        Orders order = orderService.create(orderDTO);
        return ResponseEntity.ok(order);
    }

}

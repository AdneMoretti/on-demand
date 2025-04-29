package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.request.ApproveRequestDTO;
import adnemoretti.ondemand.on_demand.dto.request.EventsRequestDTO;
import adnemoretti.ondemand.on_demand.models.Events;
import adnemoretti.ondemand.on_demand.service.EventsService;
import adnemoretti.ondemand.on_demand.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventsController {
    @Autowired
    private EventsService eventsService;

    @PostMapping()
    public ResponseEntity<Events> create(@RequestBody EventsRequestDTO eventsDTO) {
        return ResponseEntity.ok(eventsService.create(eventsDTO));
    }
}

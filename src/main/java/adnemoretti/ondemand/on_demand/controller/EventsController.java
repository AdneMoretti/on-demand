package adnemoretti.ondemand.on_demand.controller;

import adnemoretti.ondemand.on_demand.dto.request.ApproveRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventsController {
    @PostMapping()
    public ResponseEntity<EventResponseDTO> validate(@RequestBody final EventRequestDTO eventRequest) {
        return "OK";
    }
}

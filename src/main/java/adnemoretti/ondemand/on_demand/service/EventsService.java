package adnemoretti.ondemand.on_demand.service;

import adnemoretti.ondemand.on_demand.dto.request.EventsRequestDTO;
import adnemoretti.ondemand.on_demand.models.Events;
import adnemoretti.ondemand.on_demand.repository.EventsRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EventsService {

    private final EventsRepository eventsRepository;

    public EventsService(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Transactional
    public Events create(EventsRequestDTO eventsRequestDTO) {
        LocalDateTime now = LocalDateTime.now();

        Events event = new Events(eventsRequestDTO.type(), now, now);
        Events response = eventsRepository.save(event);
        eventsRepository.flush();
        return response;
    }
}
package adnemoretti.ondemand.on_demand.dto.request;

import adnemoretti.ondemand.on_demand.enums.EventTypeEnum;

import java.time.LocalDateTime;

public record EventsRequestDTO(
        EventTypeEnum type
) {
}

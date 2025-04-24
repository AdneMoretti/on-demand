package adnemoretti.ondemand.on_demand.dto;

import jakarta.validation.constraints.NotNull;

public record AddressDTO(
        @NotNull(message = "Latitude must not be null")
        double latitude,

        @NotNull(message = "Longitude must not be null")
        double longitude
) {
}

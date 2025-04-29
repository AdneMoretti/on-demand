package adnemoretti.ondemand.on_demand.dto.response;

import adnemoretti.ondemand.on_demand.dto.AddressDTO;

import java.util.UUID;

public record MerchantResponseDTO(
        UUID id,
        String nome,
        String description,
        AddressDTO address
) {

}

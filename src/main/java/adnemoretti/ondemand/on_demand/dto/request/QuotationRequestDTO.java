package adnemoretti.ondemand.on_demand.dto.request;

import java.util.UUID;

public record QuotationRequestDTO(
        UUID orderId,
        double priceBase,
        double priceSurge,
        double priceDiscount,
        double distance

) {
}

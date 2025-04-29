package adnemoretti.ondemand.on_demand.dto.request;

import adnemoretti.ondemand.on_demand.enums.OrderStatusEnum;

import java.util.UUID;

public record OrdersRequestDTO(
        UUID merchantId,
        double price,
        OrderStatusEnum status,
        UUID addressId
) {
}

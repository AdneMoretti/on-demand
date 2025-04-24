package adnemoretti.ondemand.on_demand.models;

import adnemoretti.ondemand.on_demand.dto.MerchantDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Orders {
    status ORDERS_STATUS NOT NULL

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    private double price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

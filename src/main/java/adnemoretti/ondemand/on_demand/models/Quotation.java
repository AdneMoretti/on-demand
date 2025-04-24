package adnemoretti.ondemand.on_demand.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Quotation {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;

    private double priceBase;
    private double priceSurge;
    private double priceDiscount;
    private double distance;
    private LocalDateTime createdAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Orders getCostumer() {
        return order;
    }

    public void setCostumer(Orders costumer) {
        this.order = costumer;
    }

    public double getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(double priceBase) {
        this.priceBase = priceBase;
    }

    public double getPriceSurge() {
        return priceSurge;
    }

    public void setPriceSurge(double priceSurge) {
        this.priceSurge = priceSurge;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

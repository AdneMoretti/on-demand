package adnemoretti.ondemand.on_demand.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Address {
    @Id
    private UUID id;

    private double latitude;
    private double longitude;
    public Address() {
    }

    public Address(UUID id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}

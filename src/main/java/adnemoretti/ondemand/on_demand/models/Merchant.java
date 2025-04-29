package adnemoretti.ondemand.on_demand.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Merchant {
    @Id
    private UUID id;

    private String name;
    private String description;
    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    public Merchant() {
    }
    public Merchant(UUID id, String name, String description, Address address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}

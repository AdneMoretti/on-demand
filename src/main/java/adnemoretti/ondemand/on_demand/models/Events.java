package adnemoretti.ondemand.on_demand.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private EventTypeEnum type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EventTypeEnum getType() {
        return type;
    }

    public void setType(EventTypeEnum type) {
        this.type = type;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }




}

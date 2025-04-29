package adnemoretti.ondemand.on_demand.models;
import adnemoretti.ondemand.on_demand.enums.EventTypeEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private EventTypeEnum type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Events(){
    }
    public Events(EventTypeEnum type, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

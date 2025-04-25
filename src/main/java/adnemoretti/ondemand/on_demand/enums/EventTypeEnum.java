package adnemoretti.ondemand.on_demand.enums;

public enum EventTypeEnum {
    FULL("FULL"),
    NRE("NRE"),
    AVAILABLE("AVAILABLE");

    private final String description;

    EventTypeEnum(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}

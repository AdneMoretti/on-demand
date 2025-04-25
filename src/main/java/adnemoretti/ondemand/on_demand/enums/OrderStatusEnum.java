package adnemoretti.ondemand.on_demand.enums;

public enum OrderStatusEnum {
    PENDING("PENDING"),
    WAITING_DRIVER("WAITING DRIVER"),
    DONE("DONE"),
    CANCELED("CANCELED");

    private final String description;

    OrderStatusEnum(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}

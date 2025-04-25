package adnemoretti.ondemand.on_demand.enums;

public enum OperationTypeEnum {
    SUM("SUM"),
    PRODUCT("PRODUCT");

    private final String description;
    OperationTypeEnum(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

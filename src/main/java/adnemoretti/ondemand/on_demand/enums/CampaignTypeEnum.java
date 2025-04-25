package adnemoretti.ondemand.on_demand.enums;

public enum CampaignTypeEnum {
    SURGE("SURGE"),
    DISCOUNT("DISCOUNT");

    private final String description;
    CampaignTypeEnum(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

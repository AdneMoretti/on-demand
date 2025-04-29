package adnemoretti.ondemand.on_demand.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "feature")
public class FeatureConfig {

    private double maxRadium;

    public double getMaxRadium() {
        return maxRadium;
    }

    public void setMaxRadium(double maxRadium) {
        this.maxRadium = maxRadium;
    }
}

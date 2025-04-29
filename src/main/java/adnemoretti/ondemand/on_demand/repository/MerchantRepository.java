package adnemoretti.ondemand.on_demand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import adnemoretti.ondemand.on_demand.models.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, UUID> {

}


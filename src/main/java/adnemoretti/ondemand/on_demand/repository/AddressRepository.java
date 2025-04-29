package adnemoretti.ondemand.on_demand.repository;

import adnemoretti.ondemand.on_demand.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}


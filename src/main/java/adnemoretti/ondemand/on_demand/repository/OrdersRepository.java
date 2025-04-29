package adnemoretti.ondemand.on_demand.repository;
import java.util.UUID;

import adnemoretti.ondemand.on_demand.models.Events;
import adnemoretti.ondemand.on_demand.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface OrdersRepository extends JpaRepository<Orders, UUID> {

}

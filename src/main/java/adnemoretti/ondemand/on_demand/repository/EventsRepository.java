package adnemoretti.ondemand.on_demand.repository;

import adnemoretti.ondemand.on_demand.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventsRepository extends JpaRepository<Events, Integer> {
    @Query("select * from events e order by E.created_at desc limit 1")
    Optional<Events> findLastEvent();
}


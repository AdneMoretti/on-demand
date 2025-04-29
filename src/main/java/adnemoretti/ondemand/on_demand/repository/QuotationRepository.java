package adnemoretti.ondemand.on_demand.repository;

import adnemoretti.ondemand.on_demand.models.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import adnemoretti.ondemand.on_demand.models.Merchant;

public interface QuotationRepository extends JpaRepository<Quotation, UUID> {

}


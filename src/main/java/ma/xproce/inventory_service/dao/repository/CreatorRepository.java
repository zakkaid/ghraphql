package ma.xproce.inventory_service.dao.repository;

import ma.xproce.inventory_service.dao.entity.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
}

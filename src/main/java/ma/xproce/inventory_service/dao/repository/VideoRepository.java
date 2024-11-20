package ma.xproce.inventory_service.dao.repository;

import ma.xproce.inventory_service.dao.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}

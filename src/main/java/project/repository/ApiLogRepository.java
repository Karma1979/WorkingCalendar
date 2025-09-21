package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.ApiLog;

@Repository
public interface ApiLogRepository extends JpaRepository<ApiLog, Long> {
}

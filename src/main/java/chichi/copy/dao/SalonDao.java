package chichi.copy.dao;

import chichi.copy.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonDao extends JpaRepository<Salon, Integer> {
}

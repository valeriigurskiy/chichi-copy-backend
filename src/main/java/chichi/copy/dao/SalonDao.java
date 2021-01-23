package chichi.copy.dao;

import chichi.copy.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalonDao extends JpaRepository<Salon, Integer> {

    @Query(value = "select s from Salon s where s.type=:type")
    List<Salon> getSalonsByType(String type);

}

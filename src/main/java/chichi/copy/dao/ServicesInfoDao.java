package chichi.copy.dao;

import chichi.copy.entity.Salon;
import chichi.copy.entity.ServiceInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServicesInfoDao extends JpaRepository<ServiceInfo, Integer> {

    @Query(value = "select s from ServiceInfo s where s.salon=:id")
    List<ServiceInfo> getServiceInfoBySalonId(int id);

}

package chichi.copy.dao;

import chichi.copy.entity.ServiceInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesInfoDao extends JpaRepository<ServiceInfo, Integer> {
}

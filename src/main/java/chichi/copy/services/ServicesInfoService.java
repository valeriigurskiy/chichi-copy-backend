package chichi.copy.services;

import chichi.copy.dao.SalonDao;
import chichi.copy.dao.ServicesInfoDao;
import chichi.copy.entity.ServiceInfo;

import chichi.copy.services.interfaces.IServicesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

@Service
public class ServicesInfoService implements IServicesInfoService {
    @Autowired
    public ServicesInfoDao servicesInfoDao;

    @Override
    public ServiceInfo addService(ServiceInfo servicesInfo) {
        String name = Base64.getEncoder().encodeToString(servicesInfo.getName().getBytes());
        ServiceInfo info = new ServiceInfo(servicesInfo.getId(), name, servicesInfo.getType(),
                servicesInfo.getPrice(), servicesInfo.getSalon(), servicesInfo.getDuration());
        return servicesInfoDao.save(info);
    }

    @Override
    public List<ServiceInfo> getAllServices() {
        return servicesInfoDao.findAll();
    }

    @Override
    public ServiceInfo getService(int id) {
        ServiceInfo info = servicesInfoDao.findById(id).orElseThrow(() -> new RuntimeException("Error"));
        byte[] name = Base64.getDecoder().decode(info.getName());
        return new ServiceInfo(info.getId(), new String(name, StandardCharsets.UTF_8), info.getType(), info.getPrice(), info.getSalon(), info.getDuration());
    }

    @Override
    public void removeService(int id) {
        servicesInfoDao.deleteById(id);
    }
}

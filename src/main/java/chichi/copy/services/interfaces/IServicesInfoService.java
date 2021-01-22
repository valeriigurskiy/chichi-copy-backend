package chichi.copy.services.interfaces;

import chichi.copy.entity.Salon;
import chichi.copy.entity.ServiceInfo;

import java.util.List;

public interface IServicesInfoService {

    ServiceInfo addService(ServiceInfo servicesInfo);

    List<ServiceInfo> getAllServices();

    ServiceInfo getService(int id);

    void removeService(int id);

}

package chichi.copy.controllers;

import chichi.copy.entity.Salon;
import chichi.copy.entity.ServiceInfo;

import chichi.copy.services.ServicesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;
@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*")
public class ServicesInfoController {

    @Autowired
    private ServicesInfoService servicesInfoService;

    @GetMapping()
    public List<ServiceInfo> getAll() {
        return servicesInfoService.getAllServices();
    }

    @GetMapping(value = "/test")
    public String test(){
        String originalInput = "test input";
        return Base64.getEncoder().encodeToString(originalInput.getBytes());
    }

    @GetMapping(value = "/{id}")
    public ServiceInfo findSalon(@PathVariable int id) {
        return servicesInfoService.getService(id);
    }

    @PostMapping()
    public ServiceInfo addService(@RequestBody ServiceInfo service) {
        return servicesInfoService.addService(service);
    }

    @GetMapping(value = "/salon/{id}")
    public List<ServiceInfo> getServiceInfoBySalonId(@PathVariable int id){
        return servicesInfoService.getServiceInfoBySalonId(id);
    }

}

package chichi.copy.controllers;

import chichi.copy.entity.Salon;
import chichi.copy.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salons")
@CrossOrigin(origins = "*")
public class SalonController {
    @Autowired
    private SalonService salonService;

    @GetMapping()
    public List<Salon> getAll() {
        return salonService.getAllSalons();
    }

    @GetMapping(value = "/{id}")
    public Salon findSalon(@PathVariable int id) {
        return salonService.getSalon(id);
    }

    @PostMapping()
    public Salon addSalon(@RequestBody Salon salon) {
        return salonService.addSalon(salon);
    }

}

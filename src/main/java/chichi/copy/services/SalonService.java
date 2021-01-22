package chichi.copy.services;

import chichi.copy.dao.SalonDao;
import chichi.copy.entity.Salon;
import chichi.copy.services.interfaces.ISalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalonService implements ISalonService {
    @Autowired
    public SalonDao salonDao;

    @Override
    public Salon addSalon(Salon salon) {
        return salonDao.save(salon);
    }

    @Override
    public List<Salon> getAllSalons() {
        return salonDao.findAll();
    }

    @Override
    public Salon getSalon(int id) {
        return salonDao.findById(id).orElseThrow(() -> new RuntimeException("Error"));
    }

    @Override
    public void removeSalon(int id) {
        salonDao.deleteById(id);
    }
}

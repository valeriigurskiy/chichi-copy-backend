package chichi.copy.services.interfaces;

import chichi.copy.entity.Salon;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ISalonService {

    Salon addSalon(Salon salon);

    List<Salon> getAllSalons();

    Salon getSalon(int id);

    void removeSalon(int id);

    List<Salon> getSalonsByType(String type);

}

package cr.ac.una.services;

import cr.ac.una.entities.Mocion;
import cr.ac.una.repositories.MocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MocionService {

    @Autowired //se instancia el objeto
    private MocionRepository repository;


    public List<Mocion> getAllMociones() {
        List<Mocion> list = new ArrayList<Mocion>();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void createMocion(Mocion mocion){
        repository.save(mocion);
    }

    public void deleteMocion(Integer id)
    {
        repository.deleteById(id);
    }

}

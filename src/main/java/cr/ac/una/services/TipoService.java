package cr.ac.una.services;

import cr.ac.una.entities.TipoMocion;
import cr.ac.una.repositories.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoService {
    @Autowired //se instancia el objeto
    private TipoRepository repository;

    public List<TipoMocion> getAllTipos() {
        List<TipoMocion> list = new ArrayList<TipoMocion>();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void createTipoMocion(TipoMocion tipo){
        repository.save(tipo);
    }

    public void deleteTipoMocion(Integer id)
    {
        repository.deleteById(id);
    }

}

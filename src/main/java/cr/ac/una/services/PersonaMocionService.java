package cr.ac.una.services;
import cr.ac.una.entities.PersonaMocion;
import cr.ac.una.repositories.PersonaMocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaMocionService {
    @Autowired
    private PersonaMocionRepository repository;

    public List<PersonaMocion> getAllPersonasMocion() {
        List<PersonaMocion> list = new ArrayList<PersonaMocion>();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void createPersonaMocion(PersonaMocion personamocion){
        repository.save(personamocion);
    }

    public void deletePersonaMocion(Integer id)
    {
        repository.deleteById(id);
    }




}

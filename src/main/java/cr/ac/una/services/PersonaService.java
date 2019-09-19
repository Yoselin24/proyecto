package cr.ac.una.services;

import cr.ac.una.entities.Persona;
import cr.ac.una.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    @Autowired //se instancia el objeto
    private PersonaRepository repository;


    public List<Persona> getAllPersonas() {
        List<Persona> list = new ArrayList<Persona>();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void createPersona(Persona persona){
        repository.save(persona);
    }

    public void deletePersona(Integer id)
    {
        repository.deleteById(id);
    }

}

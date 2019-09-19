package cr.ac.una.services;
import cr.ac.una.entities.AOP;
import cr.ac.una.repositories.AOPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AOPService {

    @Autowired //se instancia el objeto
    private AOPRepository repository;

    public List<AOP> getAllAOP() {
        List<AOP> list = new ArrayList<AOP>();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void createAOP(AOP aop){
        repository.save(aop);
    }

    public void deleteAOP(Integer id)
    {
        repository.deleteById(id);
    }

}

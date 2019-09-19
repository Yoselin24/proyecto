package cr.ac.una.repositories;

import cr.ac.una.entities.Mocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MocionRepository  extends JpaRepository<Mocion,Integer> {
}


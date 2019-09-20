package cr.ac.una.repositories;
import cr.ac.una.entities.PersonaMocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaMocionRepository extends JpaRepository<PersonaMocion,Integer> {
}

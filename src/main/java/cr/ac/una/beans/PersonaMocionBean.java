package cr.ac.una.beans;

import cr.ac.una.entities.Mocion;
import cr.ac.una.entities.Persona;
import cr.ac.una.entities.PersonaMocion;
import cr.ac.una.services.PersonaMocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;

@Component
public class PersonaMocionBean {

    @Autowired
    PersonaMocionService personaMocionService;
    private PersonaMocion personaMocion=new PersonaMocion();
    private Mocion mocion=new Mocion();
    private Persona persona=new Persona();
    private List<PersonaMocion> personasMocion;

    @PostConstruct
    public void init() {
        personasMocion = personaMocionService.getAllPersonasMocion();
    }

    public PersonaMocionService getPersonaMocionService() {
        return personaMocionService;
    }

    public void setPersonaMocionService(PersonaMocionService personaMocionService) {
        this.personaMocionService = personaMocionService;
    }

    public Mocion getMocion() {
        return mocion;
    }

    public void setMocion(Mocion mocion) {
        this.mocion = mocion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public PersonaMocion getPersonaMocion() {
        return personaMocion;
    }

    public void setPersonaMocion(PersonaMocion personaMocion) {
        this.personaMocion = personaMocion;
    }

    public List<PersonaMocion> getPersonasMocion() {
        return personasMocion;
    }

    public void setPersonasMocion(List<PersonaMocion> personasMocion) {
        this.personasMocion = personasMocion;
    }

    public void create() {
        try{
            personaMocionService.createPersonaMocion(personaMocion);
            personasMocion = personaMocionService.getAllPersonasMocion();
            addMessage( "Aviso","Registro insertado correctamente");
        }catch (Exception e){}
        finally {
            personaMocion=new PersonaMocion();
        }

    }

    public void delete()
    {
        Integer id=new Integer(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("PersonaId"));
        personaMocionService.deletePersonaMocion(id);
        personasMocion=personaMocionService.getAllPersonasMocion();
        addMessage("Aviso", "Registro eliminado correctamente.");
    }

    public void update() {
        personaMocionService.createPersonaMocion(personaMocion);
        personasMocion = personaMocionService.getAllPersonasMocion();
        addMessage("Aviso", "Registro modificado correctamente.");
        personaMocion=null;
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }


}

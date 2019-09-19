package cr.ac.una.beans;

import cr.ac.una.entities.Persona;
import cr.ac.una.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;


@Component
public class PersonaBean {

    @Autowired
    PersonaService personaService;
    private Persona persona = new Persona();
    private List<Persona> personas;

    @PostConstruct
    public void init() {
        personas = personaService.getAllPersonas();

    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void create() {
        try{
            personaService.createPersona(persona);
            personas = personaService.getAllPersonas();
            addMessage("Aviso", "Registro insertado correctamente.");
        }catch (Exception e){}
        finally {
            persona=new Persona();
        }

    }

    public void update() {
        personaService.createPersona(persona);
        personas = personaService.getAllPersonas();
        addMessage("Aviso", "Registro modificado correctamente.");
        persona=null;
    }

    public void delete()
    {
        Integer id=new Integer(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("PersonaId"));
        personaService.deletePersona(id);
        personas=personaService.getAllPersonas();
        addMessage("Aviso", "Registro eliminado correctamente.");
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public Persona obtienePersonas(Integer id)
    {
        if(id == null){
            throw new IllegalArgumentException("no se provee el id");
        }
        for (Persona p : personas){
            if(id.equals(p.getId_persona())){
                return p;
            }
        }
        return null;
    }

}

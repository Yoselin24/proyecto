package cr.ac.una.beans;

import cr.ac.una.entities.Mocion;
import cr.ac.una.entities.TipoMocion;
import cr.ac.una.services.MocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;

@Component
public class MocionBean {

    @Autowired
    MocionService MocionService;
    private Mocion mocion=new Mocion();
    private List<Mocion> mociones;
    private TipoMocion tipoMocion=new TipoMocion();




    @PostConstruct
    public void init() {
        mociones = MocionService.getAllMociones();
    }

    public MocionService getMocionService() {
        return MocionService;
    }

    public TipoMocion getTipoMocion() {
        return tipoMocion;
    }

    public void setTipoMocion(TipoMocion tipoMocion) {
        this.tipoMocion = tipoMocion;
    }

    public Mocion getMocion() {
        return mocion;
    }

    public void setMocion(Mocion mocion) {
        this.mocion = mocion;
    }

    public List<Mocion> getMociones() {
        return mociones;
    }

    public void setMociones(List<Mocion> mociones) {
        this.mociones = mociones;
    }

    public void create() {
        try{
            MocionService.createMocion(mocion);
            mociones = MocionService.getAllMociones();
        }catch (Exception e){}
        finally {
            mocion=new Mocion();
        }


    }

    public void delete()
    {
        Integer id=new Integer(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("PersonaId"));
       MocionService.deleteMocion(id);
       mociones=MocionService.getAllMociones();
    }

    public Mocion obtieneMociones(Integer id)
    {
        if(id == null){
            throw new IllegalArgumentException("no se provee el id");
        }
        for (Mocion p : mociones){
            if(id.equals(p.getId_mocion())){
                return p;
            }
        }
        return null;
    }

    public void update() {
        MocionService.createMocion(mocion);
        mociones= MocionService.getAllMociones() ;
        addMessage("Aviso", "Registro modificado correctamente.");
        mocion=null;
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}

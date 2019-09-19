package cr.ac.una.beans;

import cr.ac.una.entities.AOP;
import cr.ac.una.entities.Mocion;
import cr.ac.una.entities.TipoMocion;
import cr.ac.una.services.AOPService;
import cr.ac.una.services.MocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;

@Component
public class AOPBean {

    @Autowired
    cr.ac.una.services.AOPService aopService;
    private AOP aop=new AOP();
    private List<AOP> aops;

    @PostConstruct
    public void init() {
        aops = aopService.getAllAOP();
    }

    public AOPService getAopService() {
        return aopService;
    }

    public void setAopService(AOPService aopService) {
        this.aopService = aopService;
    }

    public AOP getAop() {
        return aop;
    }

    public void setAop(AOP aop) {
        this.aop = aop;
    }

    public List<AOP> getAops() {
        return aops;
    }

    public void setAops(List<AOP> aops) {
        this.aops = aops;
    }

    public void create() {
        aopService.createAOP(aop);
        aops = aopService.getAllAOP();
        aop=null;
    }




}

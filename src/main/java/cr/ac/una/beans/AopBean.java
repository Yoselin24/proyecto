package cr.ac.una.beans;

import cr.ac.una.entities.AOP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class AopBean {

    @Autowired
    cr.ac.una.services.AOPService aopService;
    private AOP aop=new AOP();
    private List<AOP> aops;

    @PostConstruct
    public void init() {
        aops = aopService.getAllAOP();
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

    public void refrescaLog()
    {
        aops=aopService.getAllAOP();
    }



}

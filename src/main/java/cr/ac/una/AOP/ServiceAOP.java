package cr.ac.una.AOP;

import cr.ac.una.services.AOPService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class ServiceAOP {

    @Autowired
    AOPService aopService;

}

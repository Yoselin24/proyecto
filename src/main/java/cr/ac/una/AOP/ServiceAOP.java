package cr.ac.una.AOP;

import cr.ac.una.entities.AOP;
import cr.ac.una.services.AOPService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Aspect
public class ServiceAOP {

    @Autowired
    AOPService aopService;
    private AOP aop=new AOP();

    @Before("execution( * cr.ac.una.services.PersonaService.createPersona(..))")
    public void creteLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Creada");
        aop.setClase("Persona");
        aopService.createAOP(aop);
    }

    @Before("execution( * cr.ac.una.services.PersonaService.deletePersona(..))")
    public void deleteLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Eliminada");
        aop.setClase("Persona");
        aopService.createAOP(aop);
    }

    @Before("execution( * cr.ac.una.services.PersonaService.getAllPersonas(..))")
    public void listLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Listado Personas");
        aop.setClase("Persona");
        aopService.createAOP(aop);
    }

    @Before("execution( * cr.ac.una.beans.PersonaBean.update(..))")
    public void updateLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Modificada");
        aop.setClase("Persona");
        aopService.createAOP(aop);
    }


}

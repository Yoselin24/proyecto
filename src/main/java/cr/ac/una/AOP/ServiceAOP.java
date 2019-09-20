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

    @Before("execution( * cr.ac.una.beans.PersonaBean.create(..))")
    public void creteLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Creada");
        aop.setClase("Persona");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.PersonaBean.delete(..))")
    public void deleteLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Eliminada");
        aop.setClase("Persona");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.services.PersonaService.getAllPersonas(..))")
    public void listLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Listado Personas");
        aop.setClase("Persona");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.PersonaBean.update(..))")
    public void updateLogPersona(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Modificada");
        aop.setClase("Persona");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.MocionBean.create(..))")
    public void creteLogMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Mocion Creada");
        aop.setClase("Mocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.services.MocionService.getAllMociones(..))")
    public void listLogMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Lista Mociones");
        aop.setClase("Mocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.MocionBean.delete(..))")
    public void deleteLogMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Eliminar Mociones");
        aop.setClase("Mocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.TipoBean.delete(..))")
    public void deleteLogTipo(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Eliminar Tipo Mocion");
        aop.setClase("TipoMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.TipoBean.update(..))")
    public void updateLogTipo(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Modificacion Tipo Mocion");
        aop.setClase("TipoMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.TipoBean.create(..))")
    public void createLogTipo(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Tipo Mocion creado");
        aop.setClase("TipoMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.services.TipoService.getAllTipos(..))")
    public void listLogTipo(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Listado Tipo Mocion");
        aop.setClase("TipoMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.PersonaMocionBean.create(..))")
    public void createLogPersonaMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Mocion creado");
        aop.setClase("PersonaMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.PersonaMocionBean.update(..))")
    public void updateLogPersonaMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Mocion Modificado");
        aop.setClase("PersonaMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.beans.PersonaMocionBean.delete(..))")
    public void deleteLogPersonaMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Persona Mocion Eliminado");
        aop.setClase("PersonaMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

    @Before("execution( * cr.ac.una.services.PersonaMocionService.getAllPersonasMocion(..))")
    public void listLogPersonaMocion(JoinPoint joinPoint)
    {
        java.util.Date fecha = new Date();
        aop.setFecha(fecha);
        aop.setTransaccion("Listado Persona Mocion");
        aop.setClase("PersonaMocion");
        aopService.createAOP(aop);
        aopService.getAllAOP();
    }

}

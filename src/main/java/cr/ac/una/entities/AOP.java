package cr.ac.una.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="aop")

public class AOP {
  @Id
    private int id;
    private String transaccion;
    private String clase;
    private Date fecha;

    public AOP() {
    }

    public AOP(int id, String transaccion, String clase, Date fecha) {
        this.id = id;
        this.transaccion = transaccion;
        this.clase = clase;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "AOP{" +
                "id=" + id +
                ", transaccion='" + transaccion + '\'' +
                ", clase='" + clase + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

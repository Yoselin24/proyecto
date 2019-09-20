package cr.ac.una.entities;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="mocion")
public class Mocion {
    @Id
    private int id_mocion;
    private java.lang.Integer tipo;
    private Date fecha;
    private String texto;
    @OneToOne
    @JoinColumn(name="tipo_mocion", nullable = false)
    private TipoMocion tipoMocion;


    public Mocion() {
    }


    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public int getId_mocion() {
        return id_mocion;
    }

    public void setId_mocion(int id_mocion) {
        this.id_mocion = id_mocion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoMocion getTipoMocion() {
        return tipoMocion;
    }

    public void setTipoMocion(TipoMocion tipoMocion) {
        this.tipoMocion = tipoMocion;
    }

    @Override
    public String toString() {
        return "Mocion{" +
                "id_mocion=" + id_mocion +
                ", tipo=" + tipo +
                ", fecha=" + fecha +
                ", texto='" + texto + '\'' +
               // ", personaMocions=" + personaMocion +
                ", tipoMocion=" + tipoMocion +
                '}';
    }
}

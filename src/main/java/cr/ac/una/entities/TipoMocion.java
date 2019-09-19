package cr.ac.una.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="tipo_mocion")
public class TipoMocion implements Serializable {
    @Id
    private int id_tipo_mocion;
    private String descripcion;

    @OneToMany(mappedBy = "tipoMocion")
    private Set<Mocion> mociones;

    public TipoMocion() { }

    public int getId_tipo_mocion() {
        return id_tipo_mocion;
    }

    public void setId_tipo_mocion(int id_tipo_mocion) {
        this.id_tipo_mocion = id_tipo_mocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoMocion{" +
                "id_tipo_mocion=" + id_tipo_mocion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

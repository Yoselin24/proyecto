package cr.ac.una.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="persona")
public class Persona implements Serializable {
    @Id
    private int id_persona;
    private String nombre;
    private String correo;
    private String telefono;
    private String centro_trabajo;
    @OneToMany(mappedBy = "persona")
    private Set<PersonaMocion> personaMocio;


    public Persona(int id_persona, String nombre, String correo, String telefono, String centro_trabajo) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.centro_trabajo = centro_trabajo;
    }

    public Persona() {
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCentro_trabajo() {
        return centro_trabajo;
    }

    public void setCentro_trabajo(String centro_trabajo) {
        this.centro_trabajo = centro_trabajo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", centro_trabajo='" + centro_trabajo + '\'' +
                '}';
    }
}

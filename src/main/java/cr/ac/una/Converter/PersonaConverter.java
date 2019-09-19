package cr.ac.una.Converter;

import cr.ac.una.beans.PersonaBean;
import cr.ac.una.entities.Persona;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value = "personaConverter")
public class PersonaConverter implements Converter {
    @Override
    public Persona getAsObject(FacesContext facesContext, UIComponent uiComponent, String idPuesto) {
        ValueExpression vex = FacesContext.getCurrentInstance().getApplication().getExpressionFactory()
                        .createValueExpression(FacesContext.getCurrentInstance().getELContext(),
                                "#{personaBean}", PersonaBean.class);

        PersonaBean personas = (PersonaBean) vex.getValue(FacesContext.getCurrentInstance().getELContext());
        System.out.println(personas.obtienePersonas(Integer.valueOf(idPuesto)).toString());
        return personas.obtienePersonas(Integer.valueOf(idPuesto));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object persona) {
        //((TipoMocion)tipoMocion).getID_TIPO_MOCION();
        String idP = String.valueOf(((Persona)persona).getId_persona());
        return idP;//.toString();
    }
}
package cr.ac.una.Converter;

import cr.ac.una.beans.TipoBean;
import cr.ac.una.entities.TipoMocion;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value = "tipoMocionConverter")
public class TipoMocionConverter implements Converter {

    @Override
    public TipoMocion getAsObject(FacesContext facesContext, UIComponent uiComponent, String id) {
        ValueExpression vex = FacesContext.getCurrentInstance().getApplication().getExpressionFactory()
                .createValueExpression(FacesContext.getCurrentInstance().getELContext(),
                        "#{tipoBean}", TipoBean.class);

        TipoBean tipos = (TipoBean) vex.getValue(FacesContext.getCurrentInstance().getELContext());
        return tipos.obtieneTipos(Integer.valueOf(id));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object tipoMocion) {
        //((TipoMocion)tipoMocion).getID_TIPO_MOCION();
        String idP = String.valueOf(((TipoMocion)tipoMocion).getId_tipo_mocion());
        return idP;//.toString();
    }



}

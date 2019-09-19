package cr.ac.una.Converter;

import cr.ac.una.beans.MocionBean;
import cr.ac.una.entities.Mocion;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "mocionConverter")
public class MocionConverter implements Converter{
        @Override
        public Mocion getAsObject(FacesContext facesContext, UIComponent uiComponent, String idPuesto) {
            ValueExpression vex = FacesContext.getCurrentInstance().getApplication().getExpressionFactory()
                    .createValueExpression(FacesContext.getCurrentInstance().getELContext(),
                            "#{mocionBean}", MocionBean.class);

            MocionBean mociones = (MocionBean) vex.getValue(FacesContext.getCurrentInstance().getELContext());
            System.out.println(mociones.obtieneMociones(Integer.valueOf(idPuesto)).toString());
            return mociones.obtieneMociones(Integer.valueOf(idPuesto));
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object mocion) {
            //((TipoMocion)tipoMocion).getID_TIPO_MOCION();
            String idP = String.valueOf(((Mocion)mocion).getId_mocion());
            return idP;//.toString();
        }

}

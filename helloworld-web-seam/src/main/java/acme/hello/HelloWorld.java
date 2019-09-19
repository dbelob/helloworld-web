package acme.hello;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorld {
    /**
     * Determines the JSF specification version
     *
     * @return JSF Specification version
     */
    public String getSpecificationVersion() {
        return FacesContext.getCurrentInstance().getClass().getPackage().getSpecificationVersion();
    }

    /**
     * Determines the JSF implementation version
     *
     * @return JSF Implementation version
     */
    public String getImplementationVersion() {
        return FacesContext.getCurrentInstance().getClass().getPackage().getImplementationVersion();
    }

    /**
     * Determines the JSF implementation title
     *
     * @return JSF implementation title
     */
    public String getImplementationTitle() {
        return FacesContext.getCurrentInstance().getClass().getPackage().getImplementationTitle();
    }
}

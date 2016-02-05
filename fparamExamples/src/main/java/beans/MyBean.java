package beans;

import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class MyBean {

    private Article article;
    private String name;

    public MyBean() {
        this.article = new Article("http://blog.primefaces.org/", 3639);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saveWithParam() {
        System.out.println("Saving data [saveWithParam()] ...");
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = fc.getExternalContext().getRequestParameterMap();

        String code = params.get("countryCode");
        String webURL = params.get("homepage");

        System.out.println("Country code: " + code + " ; web url: " + webURL);
    }

    public void ajaxAction() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = fc.getExternalContext().getRequestParameterMap();

        System.out.println("AJAX call.. " + name + "  " + params.get("surnameInputId"));
    }

}

package pages;

public class PaginaCursos extends BasePage {

    private String nombreCurso = "Introducción al Testing de Software";
    private String fundamentosTestingLink = "//a[normalize-space()='"+ nombreCurso +"' and @href]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }
}

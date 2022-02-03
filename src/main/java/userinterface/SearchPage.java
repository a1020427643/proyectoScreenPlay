package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {

    public static final Target SELECT_UNIVERSIDAD = Target.the("selecciona la opcion universidad")
            .located(By.id("universidad"));

    public static final Target CAJA_BUSQUEDA = Target.the("caja para buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BOTON_IR_A_CURSO = Target.the("boton para ir a curso")
            .locatedBy("//button[@class='btn btn-secondary']");

    public static final Target SELECCIONAR_CURSO = Target.the("seleccionar curso")
            .locatedBy("//h4[@class='result-title']/a");


    public static final Target TEXTO_COMPARATIVO = Target.the("comparar texto")
            .locatedBy("//h2[contains(text(),'Opciones')]");

}





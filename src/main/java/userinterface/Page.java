package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class Page extends  PageObject{
        public static final Target BUTTON_INGRESAR = Target.the("botón para ingresar")
        .located(By.xpath("//a[@class='btn btn-info btn-sm text-white']"));

        public static final Target CAMPO_USUARIO = Target.the("ingresar usuario")
                .located(By.id("username"));

        public static final Target CAMPO_CONTRASENA = Target.the("ingresar contraseña")
                .located(By.id("password"));

        public static final Target BOTON_ACCEDER = Target.the("boton acceder")
                .located(By.xpath(("//button[@class= 'btn btn-primary']")));

        public static final Target CAMPO_BUSCAR = Target.the("buscar el curso")
                .located(By.xpath("//class[@class='btn nav-link float-sm-left mr-1 btn-secondary']"));

}



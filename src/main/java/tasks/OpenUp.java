package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Page;

import static userinterface.Page.*;

public class OpenUp implements Task {
    private static Page page;

    public static OpenUp page() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(page),
                Click.on(BUTTON_INGRESAR),
                Click.on(CAMPO_USUARIO),
                Enter.theValue("eespinosam").into(CAMPO_USUARIO),
                Enter.theValue("Choucair2022*").into(CAMPO_CONTRASENA),
                Click.on(BOTON_ACCEDER)
        );
    }


    }



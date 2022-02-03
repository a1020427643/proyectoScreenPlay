package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.SearchPage;

public class Search implements Task {

    private String course;
    public static Search the(String course) {

        return Tasks.instrumented(Search.class,course);
    }

    public Search(String course) {
        this.course = course;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(SearchPage.SELECT_UNIVERSIDAD),
                    Enter.theValue(course).into(SearchPage.CAJA_BUSQUEDA),
                    Click.on(SearchPage.BOTON_IR_A_CURSO),
                    Scroll.to(SearchPage.SELECCIONAR_CURSO).andAlignToBottom(),
                    Click.on(SearchPage.SELECCIONAR_CURSO)

            );



    }
}

package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchPage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {

        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result = false;
        String courseName = Text.of(SearchPage.TEXTO_COMPARATIVO).viewedBy(actor).asString();
        System.out.println(courseName);
        System.out.println(question);
        if (question.equals(courseName)){

            result = true;
        }
            return result;
    }
}


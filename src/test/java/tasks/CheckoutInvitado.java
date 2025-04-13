package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckoutInvitado implements Task {

    public static CheckoutInvitado desdeCarrito() {
        return instrumented(CheckoutInvitado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(By.linkText("Checkout")),
            Click.on(By.cssSelector("input[value='guest']")),
            Click.on(By.id("button-account"))
        );
    }
}
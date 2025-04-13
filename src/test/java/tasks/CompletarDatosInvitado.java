package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CompletarDatosInvitado implements Task {

    public static CompletarDatosInvitado conInformacion() {
        return instrumented(CompletarDatosInvitado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue("Monica").into(By.id("input-payment-firstname")),
            Enter.theValue("Bustamante").into(By.id("input-payment-lastname")),
            Enter.theValue("mbus20231023@gmail.com").into(By.id("input-payment-email")),
            Enter.theValue("0968643225").into(By.id("input-payment-telephone")),
            Enter.theValue("Francisco de Orellana").into(By.id("input-payment-address-1")),
            Enter.theValue("Guayaquil").into(By.id("input-payment-city")),
            Enter.theValue("90501").into(By.id("input-payment-postcode")),
            SelectFromOptions.byVisibleText("Ecuador")
                .from(By.id("input-payment-country")),
            SelectFromOptions.byVisibleText("Guayas")
                .from(By.id("input-payment-zone")),
            Scroll.to(By.id("button-guest")),
            WaitUntil.the(By.id("button-guest"), isClickable()).forNoMoreThan(10).seconds(),
            Click.on(By.id("button-guest")),
            Click.on(By.id("button-shipping-method")),
            Click.on(By.name("agree")),
            Click.on(By.id("button-payment-method")),
            Scroll.to(By.id("button-confirm")),
            WaitUntil.the(By.id("button-confirm"), isClickable()).forNoMoreThan(10).seconds(),
            Click.on(By.id("button-confirm"))
        );
    }
}
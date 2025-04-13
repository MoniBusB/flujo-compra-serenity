package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class ConfirmacionOrden {
    public static Question<String> mensaje() {
        return actor -> actor.usingAbilityTo(net.serenitybdd.screenplay.abilities.BrowseTheWeb.class)
                .getDriver().findElement(By.cssSelector("#content h1")).getText();
    }
}
package starter.n11_seller_office.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11_seller_office.user_interface.n11SellerOfficeHomePage;


public class NavigateTo {
    public static Performable theN11SellerOfficeHomePage() {
        return Task.where("{0} opens the n11 home page",
                Open.browserOn().the(n11SellerOfficeHomePage.class));
    }
}

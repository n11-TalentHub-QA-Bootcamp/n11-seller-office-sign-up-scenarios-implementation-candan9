package starter.n11_seller_office.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerOfficeSignUpElements {
    public static Target USERNAME_FIELD = Target.the("email textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target RETYPEPASSWORD_FIELD = Target.the("login btn").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target RETYPEEMAIL_FIELD = Target.the("pass textbox").located(By.id("emailRetypeInputText"));
    public static Target STORENAME_FIELD = Target.the("login btn").located(By.id("nicknameInputText"));
    public static Target MEMBERSHIPTYPE_RADIOBUTTON = Target
            .the("pass textbox")
            .locatedBy("div.simple:nth-child(8) div.sellerOffice:nth-child(3) div.ui-panel.ui-widget.ui-widget-content.ui-corner-all.formPanel:nth-child(1) div.ui-panel-content.ui-widget-content div.inputLine:nth-child(10) table.ui-selectoneradio.ui-widget tr:nth-child(1) td:nth-child(1) div.ui-radiobutton.ui-widget div.ui-radiobutton-box.ui-widget.ui-corner-all.ui-radiobutton-relative.ui-state-default.ui-state-active > span.ui-radiobutton-icon.ui-icon.ui-icon-bullet");
    public static Target SIGNUP_BUTTON = Target.the("login btn").locatedBy(".button.green");
}

package starter.n11_seller_office.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerOfficeSignUpElements {
    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target RETYPEPASSWORD_FIELD = Target.the("retype pass textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target RETYPEEMAIL_FIELD = Target.the("retype email textbox").located(By.id("emailRetypeInputText"));
    public static Target STORENAME_FIELD = Target.the("store name textbox").located(By.id("nicknameInputText"));
    public static Target MEMBERSHIPTYPE_RADIOBUTTON = Target
            .the("membership type radio btn")
            .locatedBy("//*[@id=\"membershipTypeRadio\"]/tbody/tr/td[1]/div/div[2]");
    public static Target SIGNUP_BUTTON = Target.the("sign up btn").locatedBy(".button.green");
}

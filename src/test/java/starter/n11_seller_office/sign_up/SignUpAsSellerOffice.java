package starter.n11_seller_office.sign_up;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11.navigation.user_interface.n11LoginPageElements;
import starter.n11_seller_office.user_interface.n11SellerOfficeHomePageElements;
import starter.n11_seller_office.user_interface.n11SellerOfficeSignUpElements;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignUpAsSellerOffice implements Task {
    private final String user_name;
    private final String email_text;
    private final String password_text;
    private final String store_name_text;
    private final String email_retype_text;
    private final String password_retype_text;


    public SignUpAsSellerOffice(String user_name, String email_text, String password_text, String store_name_text, String email_retype_text, String password_retype_text) {
        this.user_name = user_name;
        this.email_text = email_text;
        this.password_text = password_text;
        this.store_name_text = store_name_text;
        this.email_retype_text = email_retype_text;
        this.password_retype_text = password_retype_text;
    }

    @Step("{0} Sign up with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11SellerOfficeHomePageElements.LOGIN_LINK),
                WaitUntil.the(n11LoginPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11SellerOfficeSignUpElements.USERNAME_FIELD),
                SendKeys.of(this.user_name).into(n11SellerOfficeSignUpElements.USERNAME_FIELD),
                Click.on(n11SellerOfficeSignUpElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SellerOfficeSignUpElements.PASSWORD_FIELD),
                Click.on(n11SellerOfficeSignUpElements.RETYPEPASSWORD_FIELD),
                SendKeys.of(this.password_retype_text).into(n11SellerOfficeSignUpElements.RETYPEPASSWORD_FIELD),
                Click.on(n11SellerOfficeSignUpElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SellerOfficeSignUpElements.EMAIL_FIELD),
                Click.on(n11SellerOfficeSignUpElements.RETYPEEMAIL_FIELD),
                SendKeys.of(this.email_retype_text).into(n11SellerOfficeSignUpElements.RETYPEEMAIL_FIELD),
                Click.on(n11SellerOfficeSignUpElements.STORENAME_FIELD),
                SendKeys.of(this.store_name_text).into(n11SellerOfficeSignUpElements.STORENAME_FIELD),
                Click.on(n11SellerOfficeSignUpElements.MEMBERSHIPTYPE_RADIOBUTTON),
                Click.on(n11SellerOfficeSignUpElements.SIGNUP_BUTTON)

        );
    }
    public static SignUpAsSellerOffice signUpAsSellerOffice(String user_name,String password_text, String password_retype_text,
    String email_text,String email_retype_text,String store_name_text
    ) {
        return instrumented(SignUpAsSellerOffice.class,
                user_name,password_text,password_retype_text,email_text,email_retype_text,
                store_name_text
        );
    }

}

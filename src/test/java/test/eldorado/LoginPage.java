package test.eldorado;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


    /**
     * определение локатора окна авторизации
     */
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/header/div[2]/div[2]/div/button")
    private WebElement loginWindow;
    /**
     * определение локатора кнопки авторазации путём введения Email
     */
    @FindBy(css = "body > div.Hf.Vf > div > form > button.Le")
    private WebElement loginemail;
    /**
     * определение локатора поля ввода логина
     */
    @FindBy(css = "body > div.Hf.Vf > div > form > span:nth-child(3) > div > div > input")
    private WebElement loginField;
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "/html/body/div[7]/div/form/button[2]")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(css = "body > div.Hf.Vf > div > form > span:nth-child(4) > span > div > input")
    private WebElement passwdField;
    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) { loginField.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) { passwdField.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginWindow() { loginWindow.click(); }
    /**
     * метод для осуществления нажатия кнопки авторизации по Email
     */
    public void clickLoginEmail() { loginemail.click(); }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт после введения данных
     */
    public void clickLoginBtn() { loginBtn.click(); }
}
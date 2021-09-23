package test.eldorado;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/header/div[2]/div[2]/div/a")
    private WebElement userMenu;
    /**
     * определение локатора профиля пользователя
     */
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div/div[1]/a[5]")
    private WebElement userProfile;
    /**
     * определение локатора имени пользователя
     */
    @FindBy(css = "#PROFILE_EMAIL")
    private WebElement userProfileName;
    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "//*[@id=\"profile-tab\"]/div/div[1]/nav/ul/li[6]/a")
    private WebElement logoutBtn;
    /**
     * метод для получения имени пользователя из меню пользователя
     */
    public String getUserName() {
        String userName = userProfileName.getAttribute("value");
        return userName; }
    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        userMenu.click(); }
    /**
     * метод для нажатия кнопки профиля пользователя
     */
    public void userProfile() {
        userProfile.click();
    }
    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click();
    }

}
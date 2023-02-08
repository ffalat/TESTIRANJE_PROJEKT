import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement


object InstarInformatikaPage {

    fun header(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"index\"]/div[3]/div/div[1]/div/div/div[3]"))

    fun searchBox(webDriver: WebDriver): WebElement = webDriver.findElement(By.id("searchInput"))
    fun searchButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"searchform\"]/button"))

    fun whatsNewButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/ul/li[3]/a"))
    fun cameraFilter(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"FilterKatePopis\"]/li[1]/label"))
    fun batteryFilter(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"FilterKatePopis\"]/li[3]/label"))
    fun diskFilter(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"FilterKatePopis\"]/li[4]/label"))


    fun laptopsComputersCategoryButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"index\"]/div[4]/div/div[1]/div/ul/li[1]/a"))
    fun gamingLaptopsButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"index\"]/div[4]/div/div[1]/div/ul/li[1]/div/div/div[2]/ul/li[1]/a"))
    fun addToCartButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"product-list-wrapper\"]/div[2]/div/div[8]/a"))
    fun cartButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"topbasket\"]/a/span[1]"))
    fun cartSizeLabel(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"topbasket\"]/a/span[2]"))

    fun profileMenuDropdown(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"index\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a/span"))
    fun usernameTextbox(webDriver: WebDriver): WebElement = webDriver.findElement(By.id("username"))
    fun passwordTextbox(webDriver: WebDriver): WebElement = webDriver.findElement(By.id("pass"))
    fun loginButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("//*[@id=\"index\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/ul/li/form/div[4]/input"))
    fun profileMenuDropdownLogged(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a/span"))
    fun editProfileButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/ul/li/ul/li[3]/a"))
    fun wishListButton(webDriver: WebDriver): WebElement = webDriver.findElement(By.xpath("/html/body/div[5]/ul/li[3]/a"))
}
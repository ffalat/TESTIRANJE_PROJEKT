import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

object WebDriverFactory {

    private const val CHROME_DRIVER_PATH = "D:\\MTTPP\\drivers\\chromedriver.exe"
    private const val FIREFOX_DRIVER_PATH = "D:\\MTTPP\\drivers\\geckodriver.exe"

    fun createWebDriverManager(browser: Browser): WebDriverManager {
        return when (browser) {
            Browser.Chrome -> {
                System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH)
                WebDriverManager.chromedriver()
            }
            Browser.Firefox -> {
                System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER_PATH)
                WebDriverManager.firefoxdriver()
            }
        }
    }

    fun createWebDriver(browser: Browser): WebDriver {
        return when(browser) {
            Browser.Chrome -> ChromeDriver()
            Browser.Firefox -> FirefoxDriver()
        }
    }
}
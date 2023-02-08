import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue



class WebTest {

    companion object {
        private const val BASE_TEST_URL = "https://www.instar-informatika.hr/"

        //user credentials
        private const val username = ""
        private const val password = ""
    }

    private val webDriverManager by lazy { WebDriverFactory.createWebDriverManager(Browser.Chrome) }
    private val webDriver by lazy { WebDriverFactory.createWebDriver(Browser.Chrome) }

    private fun sleep(seconds: Long = 2){
        Thread.sleep(seconds * 1000)
    }

    @BeforeClass
    private fun setUpDriver() {
        webDriverManager.setup()
    }

    @BeforeTest
    private fun setUp(){
        webDriver.apply {
            manage().window().maximize()
            navigate().to(BASE_TEST_URL)
        }
    }

    @BeforeMethod
    private fun goToBaseUrl(){
        webDriver.navigate().to(BASE_TEST_URL)
    }

    @Test
    private fun testHeaderDisplayed(){
        assertTrue(InstarInformatikaPage.header(webDriver).isDisplayed)
    }

    @Test
    private fun testSearchBoxFindsItem(){
        val itemName = "Laptop"

        InstarInformatikaPage.searchBox(webDriver).sendKeys(itemName)
        InstarInformatikaPage.searchButton(webDriver).click()

        assertTrue(webDriver.currentUrl.endsWith(itemName))
    }

    @Test
    private fun testFilterItems(){
        InstarInformatikaPage.whatsNewButton(webDriver).click()

        WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(InstarInformatikaPage.cameraFilter(webDriver)))

        InstarInformatikaPage.cameraFilter(webDriver).click()
        InstarInformatikaPage.batteryFilter(webDriver).click()
        InstarInformatikaPage.diskFilter(webDriver).click()

        sleep()
    }

    @Test
    private fun testAddToCart(){
        Actions(webDriver).moveToElement(InstarInformatikaPage.laptopsComputersCategoryButton(webDriver)).build().perform()

        WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(InstarInformatikaPage.gamingLaptopsButton(webDriver)))

        InstarInformatikaPage.gamingLaptopsButton(webDriver).click()

        WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(InstarInformatikaPage.addToCartButton(webDriver)))

        InstarInformatikaPage.addToCartButton(webDriver).click()
        InstarInformatikaPage.cartButton(webDriver).click()

        val count = InstarInformatikaPage.cartSizeLabel(webDriver).text.toInt()
        assert(count > 0)
    }

    @Test
    private fun testProfileMenuChangeTab(){
        Actions(webDriver).moveToElement(InstarInformatikaPage.profileMenuDropdown(webDriver)).build().perform()

        WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(InstarInformatikaPage.usernameTextbox(webDriver)))

        InstarInformatikaPage.usernameTextbox(webDriver).sendKeys(username)
        InstarInformatikaPage.passwordTextbox(webDriver).sendKeys(password)
        InstarInformatikaPage.loginButton(webDriver).click()

        WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(InstarInformatikaPage.profileMenuDropdownLogged(webDriver)))

        Actions(webDriver).moveToElement(InstarInformatikaPage.profileMenuDropdownLogged(webDriver)).build().perform()
        InstarInformatikaPage.editProfileButton(webDriver).click()

        WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(InstarInformatikaPage.wishListButton(webDriver)))

        InstarInformatikaPage.wishListButton(webDriver).click()

        assertEquals("https://www.instar-informatika.hr/userpages.asp#PTabWishList", webDriver.currentUrl)
        //this test fails because url is not changed when tab is changed

    }

    @AfterTest
    private fun tearDown(){
        webDriver.quit()
    }
}
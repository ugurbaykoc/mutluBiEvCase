import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestMethods {
        WebDriver driver;

        public void Setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://mutlubiev.com/giris-yap");

        }

        public void VerifyPageTitle() {
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Mutlubiev'e Giriş Yap - mutlubiev.com";
            if (ActualTitle.equals(ExpectedTitle)) {
                System.out.println("Title test passed");
            } else {
                System.out.println("Title test failed" + ExpectedTitle);
            }


        }
        public boolean verifyFacebookLoginButton()
        {
            boolean facebookButtonPresent = driver.findElement(By.linkText("Giriş Yap")).isDisplayed();
            if (facebookButtonPresent== true)
            {
                System.out.println("Facebook button is verified");
            }
            else
            {
                System.out.println("Facebook button is not there");
            }
            return facebookButtonPresent;
        }
        public  boolean verifyForgetPwLink()
        {
            boolean forgetPasswordLinkVisible = driver.findElement(By.linkText("Şifremi Unuttum")).isDisplayed();
            if (forgetPasswordLinkVisible == true)
            {
                System.out.println("Forget Password Link Present");
            }
            else
            {
                System.out.println("Forget password link is not there");
            }
            return forgetPasswordLinkVisible;

        }
        public void Login()
        {
            WebElement username = driver.findElement(By.id("Email"));
            WebElement password = driver.findElement(By.id("Password"));
            WebElement login =driver.findElement(By.xpath("//button[@class='red-action-button submit-btn']"));
            username.sendKeys("ugurbaykoc@gmail.com");
            password.sendKeys("ugur123123");
            login.click();

            String actualUrl ="https://mutlubiev.com/#fromLogin=1";
            String expectedUrl = driver.getCurrentUrl();

            Assert.assertEquals(expectedUrl,actualUrl);

        }

    }




import org.junit.Test;

public class MyTest extends MyTestMethods {
        @Test
        public void Test ()
        {
            System.setProperty("webdriver.chrome.driver", "/Users/ugurbaykoc/Downloads/chromedriver");
            MyTest myTest = new MyTest();
            myTest.Setup();
            myTest.VerifyPageTitle();
            myTest.verifyFacebookLoginButton();
            myTest.verifyForgetPwLink();
            myTest.Login();

        }

    }



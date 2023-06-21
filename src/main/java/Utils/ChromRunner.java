package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromRunner {
    public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void openChrom(){
        driver.manage().window().maximize();
        driver.get("https://accounts.gpih.ge/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fresponse_type%3Dcode%26client_id%3Dmygpi%26state%3DLVJtcWlCa3RqM055M2lNby5Td2VQMGtna2lkVW5BSV9QVWVWQUFPbkh6aE93;%25252Fka-GE%25252Fpersonal-area%25252Fdashboard%26redirect_uri%3Dhttps%253A%252F%252Fmygpi.ge%252Fka-GE%252Fidentity%26scope%3Dopenid%2520profile%2520offline_access%26code_challenge%3DZBHdqDRMWAuzWr7RMEeMMNvBGFry401wYANloqJaVfw%26code_challenge_method%3DS256%26nonce%3DLVJtcWlCa3RqM055M2lNby5Td2VQMGtna2lkVW5BSV9QVWVWQUFPbkh6aE93%26culture%3Dka-GE");
    }
    @AfterTest
    public void closeChrome(){
        driver.close();
    }
}

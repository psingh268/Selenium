import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fileUploadAutoID {
	@Test
	public void fileUpload() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:/selenium_vedio/driver_selenium/geckodriver-v0.19.1-win32/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/fileupload.html");
		driver.findElement(By.xpath("/html/body/input")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\selenium_vedio\\autoIT\\fileupload.exe");
	}

}

package demosample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demogit {
	@Test
	public void Demo() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	List<WebElement> eles = driver.findElements(By.xpath("//*"));
	int count=eles.size();
	for(int i=0;i<count;i++)
	{
		WebElement ele=eles.get(i);
		String tag = ele.getTagName();
		System.out.println(tag);
	}
}


}

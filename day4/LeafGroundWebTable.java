package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node0u6sjm72dovsyzfrsqt5kjqlc393322.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table = driver.findElement(By.xpath("//tbody[@id='form:j_idt89_data']"));
		System.out.println(table.getSize());
		List<WebElement> tablerows=driver.findElements(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr"));
		List<WebElement> tablecolumn=driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//th"));
		System.out.println("Table rows:\t"+tablerows.size());
		System.out.println("Table columns:\t"+tablecolumn.size());
		List<String> rows=new ArrayList<String>();
		for(int i=0;i<tablerows.size();i++) {
			 String text = tablerows.get(i).getText();
			 rows.add(text);			 
		}
		System.out.println(rows);
	}
}



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBusca {
 private WebDriver driver;
 
 @Before
 public void abrirNavegador() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://localhost:4200/login");
	 
	 
 }
 
 @Test
public void testeNavegador() {
	 
	WebElement inputEmail = driver.findElement(By.id("email"));
	WebElement inputSenha = driver.findElement(By.id("senha"));
	WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
	
	inputEmail .sendKeys("geovane@g.com");
	inputSenha.sendKeys("123");
	botaoLogin.click();
	
	
 }
 

 
 
}

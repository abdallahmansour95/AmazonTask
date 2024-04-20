package amazonPackage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {
	
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
	Assertion myAssert = new Assertion();
	
	
	String URL ="https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc";
	
	String MyEmailField = "mansourabdallah357@yahoo.com";
	String MyName ="Abdallah Mansour";
	String MyMessage = "Enjoy your Gift";
	String MyQuantity = "2";
	
	

}

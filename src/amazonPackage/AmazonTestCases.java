package amazonPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AmazonTestCases extends Parameters {

	@BeforeTest()

	public void mySetup() throws InterruptedException {

		driver.get(URL);
		driver.manage().window().maximize();

		WebElement PopMsg = driver.findElement(By.cssSelector("div[role='alertdialog']"));

		if (PopMsg.isDisplayed()) {

			WebElement DismissBtn = driver.findElement(By.className("a-button-input"));
			Thread.sleep(2000);

			DismissBtn.click();

		}

	}

	@Test(priority = 1)

	public void addRandomGift() throws InterruptedException {

		WebElement GiftCardBtn = driver.findElement(By.linkText("Gift Cards"));
		GiftCardBtn.click();
		Thread.sleep(2000);

		WebElement SpecGiftCardBtn = driver.findElement(By.xpath("//img[@alt='Specialty Gift Cards']"));
		SpecGiftCardBtn.click();
		Thread.sleep(2000);

		WebElement contanier = driver.findElement(By.className("a-carousel"));

		List<WebElement> myGiiftList = contanier.findElements(By.tagName("li"));

		int RandomIndex = rand.nextInt(myGiiftList.size());

		myGiiftList.get(RandomIndex).click();

		Thread.sleep(3000);

	}

	@Test(priority = 2)

	public void addRandomAmount() throws InterruptedException {

		WebElement AmountContanier = driver.findElement(By.id("gc-amount-mini-picker"));

		List<WebElement> AmountList = AmountContanier.findElements(By.tagName("button"));

		int RandomIndexTwo = rand.nextInt(AmountList.size());

		AmountList.get(RandomIndexTwo).click();

		Thread.sleep(3000);

	}

	@Test(priority = 3)

	public void amountAssertion() {

		String ActualAmount = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']")).getText();
		String[] ExpectedAmount = { "$25.00", "$50.00", "$100.00", "$150.00", "$200.00", "$250.00", "$300.00",
				"$350.00", "$400.00", "$450.00", "$500.00" };
		boolean matchFound = false;
		for (String expected : ExpectedAmount) {
			if (ActualAmount.equals(expected)) {
				matchFound = true;
				break;
			}
		}
		myAssert.assertTrue(matchFound);

		System.out.println(ExpectedAmount);
		System.out.println(ActualAmount);
	}
	
	
	
	@Test(priority = 4)
	
	
	public void fullInfo() throws InterruptedException {
		
		WebElement Email = driver.findElement(By.id("gc-order-form-recipients"));
		Email.sendKeys(MyEmailField);
		
		Thread.sleep(2000);
		
		WebElement Name = driver.findElement(By.id("gc-order-form-senderName"));
		Name.sendKeys(MyName);
		
		Thread.sleep(2000);
		
		
		// Find the input field
        WebElement MessageField = driver.findElement(By.id("gc-order-form-message"));

        // Get the value of the input field
        String currentText = MessageField.getAttribute("value");

        // Check if the input field has existing text
        if (!currentText.isEmpty()) {
            // Clear the text in the input field
        	MessageField.clear();
        }
        
        

        // Send new keys to the input field
       
        MessageField.sendKeys(MyMessage);
        
        
        
        
     // Find the date input field
        WebElement dateInputField = driver.findElement(By.xpath("//div[@id='gc-delivery-mechanism-form-Email']//i[@class='a-icon a-icon-calendar']"));

        // Click on the date input field to open the date picker
        dateInputField.click();
        
        Thread.sleep(2000);
        
        WebElement DateBtn = driver.findElement(By.cssSelector("td[class='a-cal-d a-cal-d-1713733200000'] a[class='a-declarative a-cal-date-anchor']"));

        // Click on the date input field to open the date picker
        DateBtn.click();
        
        
        
        
		
		
        
       
		
		
		
	}
		

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



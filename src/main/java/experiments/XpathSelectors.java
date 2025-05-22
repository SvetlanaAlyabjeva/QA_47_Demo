package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsRadioButtonPage() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
        //WebElement radioButtonImp = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        WebElement radioButtonImp = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        radioButtonImp.click();
        pause(5);
        driver.quit();

    }

    @Test
    public void selectorsTextBox() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
        WebElement inputFullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        inputFullName.sendKeys("Mommy");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        inputEmail.sendKeys("qa123@gmail.com");
        WebElement labelTextCurAddr= driver.findElement(By.xpath("//label[text()='Current Address']"));
        System.out.println(labelTextCurAddr);
        WebElement textAreaCurAdr = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        textAreaCurAdr.sendKeys("Mommy str 444");
        WebElement textPerAdr = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea"));
        textPerAdr.sendKeys("Mommy av 9");
        WebElement btnSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
        btnSubmit.click();
        WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
        System.out.println(output.getText());

        pause(5);
        //driver.quit();
    }

    public void pause(int time) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideBanner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript
                ("document.querySelector('#fixedban')" +
                        ".style.display='none'");
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript
                ("document.querySelector('footer')" +
                        ".style.display='none'");
    }
}

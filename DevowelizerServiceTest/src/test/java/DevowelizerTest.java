import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DevowelizerTest extends BaseTest {


    @Test
    //Testing Vowel letters Functionality
    public void testDevowelizer() {
        driver.get("http://localhost:8080/:inputorderallocationexecution");
        String WholeWord = driver.findElement(By.xpath("/html/body")).getText();
        Assert.assertEquals( WholeWord, ":nptrdrllctnxctn");
    }

@Test
    //Test Captialization functionality
    public void testCaptialization() {
    driver.get("http://localhost:8080/InPUt");
    String CapitalCharacters = driver.findElement(By.xpath("/html/body")).getText();
    Assert.assertEquals( CapitalCharacters, "nPt");
//Test Failed Because vowel capitial words is not included into account by the developer

}
@Test
//Testing if few special characters is allowed or not
    public void testSpectialCharacters() {
        driver.get("http://localhost:8080/input!@#$");
        String SpecialCharacters = driver.findElement(By.xpath("/html/body")).getText();
        Assert.assertEquals( SpecialCharacters, "npt!@#$");
        //Test failed because not all special characters appeared but maybe that was part of the implementation or requried
}
@Test
// Testing numbers
    public void testNumbers() {
    driver.get("http://localhost:8080/1234567890");
    String SpecialCharacters = driver.findElement(By.xpath("/html/body")).getText();
    Assert.assertEquals( SpecialCharacters, "1234567890");
}

@Test
//Testing Spaces
    public void testSpaces() {
    driver.get("http://localhost:8080/Test Spaces Functionality");
    String SpecialCharacters = driver.findElement(By.xpath("/html/body")).getText();
    Assert.assertEquals( SpecialCharacters, "Tst Spcs Fnctnlty");

}
}

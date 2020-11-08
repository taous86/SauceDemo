package pages;

import jdk.internal.dynalink.linker.LinkerServices;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean CheckElementIsVisible(){
        return driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
    }

    public void openMenu(){
        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
    }
    public boolean checkMenuIsVisible(){

        boolean b= driver.findElement(By.xpath("//button[text()='Open Menu']")).isDisplayed();
        System.out.println(b);
        return b;

    }

    public int menuItems(){
        List<WebElement> items= driver.findElements(By.xpath("//nav/a"));
        return items.size();
    }

    public void navigatetoLink(String link){
        if(link.equalsIgnoreCase("Cart")){
            driver.findElement(By.id("shopping_cart_container")).click();
        }
        driver.findElement(By.linkText(link)).click();
    }
    public int checkProducts(){
        return driver.findElements(By.xpath("//div[@class='inventory_item']")).size();

    }

    public void selectOption(String option){
        WebElement dropdown =driver.findElement(By.xpath("//select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public String checkFirstproduct(){
        WebElement first = driver.findElements(By.xpath("//div[@class='inventory_item']")).get(1);
        return first.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();

    }

    public void navigateToCart(){
        driver.findElement(By.id("shopping_cart_container")).click();

    }
}

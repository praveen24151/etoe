

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
//static WebDriver driver;

public static void main(String[] args){

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.path2usa.com/travel-companions");
}
}

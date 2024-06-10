package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=Y4a18N9e3vM&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJvYXV0aF9rZXkiOiJZNGExOE45ZTN2TSIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNzEzNjMzMTMxLCJpYXQiOjE3MTM2MzE5MzEsImp0aSI6IjM3NGE1MGE5LTM3NGItNDA3ZC1hYTI5LTNkOTJhMDc3Mzg3YSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.JuXU6QKaVAf4q-UhDAfwSEp2zCdDDq9ZOzTScGlgEHC7BJRYkrh7RAgU6EZZgKwJ_x5m4HW53quxEbYQAmwArlNxWqzJXxaImPZUR967e0Edye9ujjA2FLxK9Y9SEopoY3tdA9D7oB12_ZDFpACSwu73DS-6xs4d-JGfvVTC8F85KqxK6UqV-4UK7VrOZp6uZXD8BI1To86aC8Ux47p2PTsvNNvDz2X7ULag1PV3GlS_H18TSlascZ52WL9Pk-TzUQ-GL5H5HqzTDXYOzVsEnh8N3C93Y56e9Bq8-LdVFJQo15bj3nd7DvF6FF6noWf5vvhzXH6q4xJW4WOrR963PA&preferred_environment=");
		driver.manage().window().maximize();
	}
	
	public String veryfyTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterUserNameAndPasswor(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
	}
	
	public String readErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	public void closeBrowser() {
		driver.quit();
	}
	
}
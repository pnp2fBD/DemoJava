package Polymorphism;

public class Client {
	
	public static void main(String[] args){
		BaseConfiguration config = new BaseConfiguration();
		config.getBrowser();
		
		config = new ChromeConfiguration();
		config.getBrowser();
		
		config = new FirefoxConfiguration();
		config.getBrowser();
	}
}

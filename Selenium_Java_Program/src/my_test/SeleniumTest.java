package my_test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {

	public static void main(String[] args){
		System.out.println(System.getProperty("java.class.path"));
		System.out.println( "Hello World!" );
	    System.out.println("Program Starts from here");
	    System.out.println("launching IE browser");
	    
	    
// Set path of IEDriverServer.exe.
//	    String driverPath = "E:\\Selenium_Java_Program\\lib\\IEDriverServer.exe";
//	    System.setProperty("webdriver.ie.driver", driverPath);
//	    DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
//	    dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);  //If IE fail to work, please remove this and remove enable protected mode for all the 4 zones from Internet options
	    
// Initialize InternetExplorerDriver Instance.
	   // WebDriver driver = new InternetExplorerDriver();
	    
//	    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//	    capabilities.setCapability("requireWindowFocus", true);  
//	    capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
//	    capabilities.setCapability("ie.ensureCleanSession", true);
//	    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//	    capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
	    	    
//	    WebDriver driver = new InternetExplorerDriver();
//	    driver.manage().window().maximize();
//	    Thread.sleep(10000);
//	    driver.get("http://gmail.com");
//	    Thread.sleep(10000);
//	    driver.quit();   
//	    System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
//	    System.setProperty("webdriver.edge.driver", "/path/to/edgedriver");
//	    WebDriver driver = new FirefoxDriver();
//	    WebDriver driver = new EdgeDriver();
		}
	}
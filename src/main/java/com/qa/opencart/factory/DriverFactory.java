package com.qa.opencart.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public WebDriver driver;
	public Properties prop;
	public OptionsManager optionsManager;
	public static String highlight;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public WebDriver initDriver(Properties prop) {
		String browserName = prop.getProperty("browser").trim();
		//String browserName =System.getProperty("browser");//cmd line argument
		highlight = prop.getProperty("highlight");
		System.out.println("Browser name is " + browserName);
		optionsManager = new OptionsManager(prop);

		if (browserName.equalsIgnoreCase("chrome")) {
			
			if(Boolean.parseBoolean(prop.getProperty("remote"))) {
				//remote execution on docker/grid/cloud
				init_remoteDriver("chrome");
			}else {
				//local execution
				tlDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
			}
			
			
			// driver = new ChromeDriver();
			// driver = new ChromeDriver(optionsManager.getChromeOptions());
			//
		} else if (browserName.equalsIgnoreCase("firefox")) {

			if(Boolean.parseBoolean(prop.getProperty("remote"))) {
				//remote execution on docker/grid/cloud
				init_remoteDriver("firefox");
			}else {
				//local execution
				tlDriver.set(new FirefoxDriver(optionsManager.getFirefoxOptions()));
			}

		}  else if (browserName.equalsIgnoreCase("edge")) {
			if(Boolean.parseBoolean(prop.getProperty("remote"))) {
				//remote execution on docker/grid/cloud
				init_remoteDriver("edge");
			}else {
				//local execution
				tlDriver.set(new EdgeDriver(optionsManager.getEdgeOptions()));
			}
		}
		else if (browserName.equalsIgnoreCase("safari")) {
			// driver = new SafariDriver();
			tlDriver.set(new SafariDriver());
		}

		else {
			System.out.println("Please passs the right browser" + browserName);
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(prop.getProperty("url"));

		return getDriver();
	}
	
	private void init_remoteDriver(String browserName) {

		System.out.println("Running test cases on remote grid server: " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			try {
				tlDriver.set(
						new RemoteWebDriver(new URL(prop.getProperty("huburl")), optionsManager.getChromeOptions()));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		if (browserName.equalsIgnoreCase("firefox")) {
			try {
				tlDriver.set(
						new RemoteWebDriver(new URL(prop.getProperty("huburl")), optionsManager.getFirefoxOptions()));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		if (browserName.equalsIgnoreCase("edge")) {
			try {
				tlDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), optionsManager.getEdgeOptions()));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

	}
	
	

	// get the local thread copy of the driver
	public synchronized static WebDriver getDriver() {
		return tlDriver.get();
	}
	
	/**
	 * this is used to init the properties from the .properties file
	 * 
	 * @return this returns properties (prop)
	 */

	public Properties initProp() {
		prop = new Properties();
		FileInputStream ip = null;
		// mvn clean install -Denv="qa"
		// mvn clean install
		
		String envName = System.getProperty("env");
		System.out.println("running test suite on env--->" + envName);
		//Log.info("running test suite on env--->" + envName);
		if (envName == null) {
			System.out.println("env name is not given, hence running it on QA environment....");
			try {
				ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
			} catch (FileNotFoundException e) {
				//Log.error("file not found", e);
				e.printStackTrace();
			}
		}else {
			try {
				switch (envName.trim().toLowerCase()) {
				case "qa":
					ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
					break;
				case "stage":
					ip = new FileInputStream("./src/test/resources/config/stage.config.properties");
					break;
				case "dev":
					ip = new FileInputStream("./src/test/resources/config/dev.config.properties");
					break;
				case "uat":
					ip = new FileInputStream("./src/test/resources/config/uat.config.properties");
					break;
				case "prod":
					ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
					break;

				default:
					System.out.println("please pass the right env name.." + envName);
					//throw new FrameworkException("===WRONGENVPASSED===");
				}
			} catch (FileNotFoundException e) {
				//Log.error("file not found", e);
				e.printStackTrace();
			}
		}
		try {
			prop.load(ip);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	
	}
	/**
	 * take screenshot
	 *POM 9 start 1 mins
	 */
	public static String getScreenshot() {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileHandler.copy(srcFile, destination);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;

	}

}

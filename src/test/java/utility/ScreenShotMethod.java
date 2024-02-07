package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMethod {
public static String takeShot(WebDriver driver,String name) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String systemPath = System.getProperty("user.dir")+"//ScreenshotCaptures//"+name+".jpg";
	File path = new File(systemPath);
	FileHandler.copy(source, path);
	return systemPath;
}
}

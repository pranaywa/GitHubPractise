package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropData {
public String readProp(String data) throws IOException {
	String filePath = System.getProperty("user.dir")+"\\test\\resource\\config.properties";
	FileInputStream fis = new FileInputStream(filePath);
	Properties prop = new Properties();
	prop.load(fis);
	String datas = prop.getProperty(data);
	return datas;
}
public static void main(String[]args) throws IOException {
	ReadPropData p = new ReadPropData();
	String password = p.readProp("password");
	String name = p.readProp("name");
	System.out.println("The name is "+name);
	System.out.println("Then password is "+password);
}
}

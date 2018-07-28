import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {

	public void readProperty throws Exception {
		Properties props=new Properties();
		FileInputStream io=new FileInputStream("C:/Users/hcl/workspace/seleniumpractice/config.properties");
		props.load(io);
		System.out.println(props.getProperty("name"));

	}

}

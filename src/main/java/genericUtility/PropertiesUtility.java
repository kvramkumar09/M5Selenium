package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This is Utility class to work with properties file
 * @author Ram.Kumar
 *
 */

public class PropertiesUtility {
	
	/**
	 * This is a utility method to fetch data from properties file
	 * @param key
	 * @return
	 * @throws Exception
	 */

	public String getDataFromPropertiesFile(String key) throws Exception{
		FileInputStream fis = new FileInputStream(IConstantUtility.propertiesPath);
		Properties p = new Properties();
		p.load(fis);
		String value= p.getProperty(key);
		return value;
	}
}

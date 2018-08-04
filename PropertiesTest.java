package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author me
 * @date 2018年6月13日  
 * @version 1.0.0 
 * 
 * 程序只能运行5次，超过就退出，
 * 视频-46--Io流
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
	
		Count();
	}

	/**
	 * @throws IOException 
	 * 
	 */
	public static void Count() throws IOException {
		File file = new File("1.ini");
		
		if(!file.exists())
			file.createNewFile();
		
		FileInputStream config = new FileInputStream(file);
		Properties prop = new Properties();
		
		prop.load(config);
		
		String value = prop.getProperty("time");
		int count =0;
		if(value != null){
			count = Integer.parseInt(value);
			if(count >= 5)
				throw new RuntimeException("注册");
		}
		count++;

		prop.setProperty("time",count+"");
		
		FileOutputStream fw = new FileOutputStream(file);
		
		prop.store(fw, "");
		fw.close();config.close();
	}
	
	
}

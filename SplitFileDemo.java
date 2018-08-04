package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author me
 * @date 2018年6月15日  
 * @version 1.0.0 
 * 切割文件
 */
public class SplitFileDemo {
	private static final int Size = 1024*10;

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\28-160415145T9-50.jpg");
		Split(file);
	}
	
	public static void Split(File file) throws IOException{
		
		//读取源文件
		FileInputStream fis = new FileInputStream(file);
		
		//定义读取大小1k	
		byte[] b = new byte[Size];
		
		//定义读取流
		FileOutputStream fos = null;
		
		int len = 0;
		int count = 1;
		//切割到目的目录
		File dir = new File("E:\\java");
		while((len = fis.read(b))!= -1){
			fos = new FileOutputStream(new File(dir,count++ + ".part"));
			fos.write(b,0,len);
		}
		fos.close();
		fis.close();
	}
}

package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author me
 * @date 2018��6��15��  
 * @version 1.0.0 
 * �и��ļ�
 */
public class SplitFileDemo {
	private static final int Size = 1024*10;

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\28-160415145T9-50.jpg");
		Split(file);
	}
	
	public static void Split(File file) throws IOException{
		
		//��ȡԴ�ļ�
		FileInputStream fis = new FileInputStream(file);
		
		//�����ȡ��С1k	
		byte[] b = new byte[Size];
		
		//�����ȡ��
		FileOutputStream fos = null;
		
		int len = 0;
		int count = 1;
		//�иĿ��Ŀ¼
		File dir = new File("E:\\java");
		while((len = fis.read(b))!= -1){
			fos = new FileOutputStream(new File(dir,count++ + ".part"));
			fos.write(b,0,len);
		}
		fos.close();
		fis.close();
	}
}

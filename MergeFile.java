package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * @author me
 * @date 2018年6月15日  
 * @version 1.0.0 
 *
 * 合并碎片文件
 */
public class MergeFile {
	private static final int Size = 1024*10;

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\java");
		Merge(file);
	}
	
	public static void Merge(File dir) throws IOException{
	
		File[] s = dir.listFiles(new SuffFilter(".part"));
		
		//得到碎片文件
		ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
		
		for(int i=1;i<7;i++)
			list.add(new FileInputStream(new File(dir,i+".part")));
		
		Enumeration<FileInputStream> en = Collections.enumeration(list);
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream(new File(dir,"1.jpg"));
		byte[] buf = new byte[Size];
				
		int len = 0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
		
	}
}

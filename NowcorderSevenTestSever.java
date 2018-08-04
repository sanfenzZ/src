package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author me
 * @date 2018年7月13日  
 * @version 1.0.0 
 */
public class NowcorderSevenTestSever {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9090);
		System.out.println("服务器已启动");
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os),true);
		pw.write("hello");
		pw.flush();
		
		//释放资源
		br.close();
		is.close();
		pw.close();
		os.close();
		s.close();
		ss.close();
		
		System.out.println("服务器已关闭");
	
	}
}

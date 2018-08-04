package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author me
 * @date 2018年7月13日  
 * @version 1.0.0 
 */
public class NowcorderSevenTestClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket(InetAddress.getLocalHost(),9090);
		
		System.out.println("客户端启动了");
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os),true);
		pw.print("hello world");
		pw.flush();
		
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while((line = br.readLine())!= null){
			System.out.println(line);
		}

		pw.close();
		os.close();
		br.close();
		is.close();
		s.close();
		System.out.println("客户端关闭了");
	}
}

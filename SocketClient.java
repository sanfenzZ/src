package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author me
 * @date 2018年7月14日  
 * @version 1.0.0 
 */
public class SocketClient {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket("localhost",8888);
		
		OutputStream os = s.getOutputStream();
		PrintWriter pr = new PrintWriter(os,true);
		pr.print("我连上服务器了");
		
		//InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String temp = null;
		while((temp = br.readLine())!= null){
			System.out.println("收到服务器消息"+temp);
			pr.flush();
		}
		
		br.close();
		pr.close();
		os.close();
		s.close();
		
		
		
	}
}
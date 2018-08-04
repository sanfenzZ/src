package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author me
 * @date 2018��7��14��  
 * @version 1.0.0 
 */
public class SocketServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("������������");
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		String temp = null;
		while((temp = br.readLine())!= null){
			System.out.println("���յ���Ϣ");
			System.out.println("�����յ���ϢΪ��"+temp+"�õ���Ϣ��IP��ַ�ǣ�"+ss.getInetAddress().getHostAddress());
			out.flush();
		}
		
		OutputStream os = s.getOutputStream();
		PrintWriter pr = new PrintWriter(os);
		pr.print("�������յ���Ϣ��");
		pr.flush();
		
		pr.close();
		is.close();
		os.close();
		s.close();
		
		
		
	}
}

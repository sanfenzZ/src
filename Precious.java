	package str;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	/**
	 * @author me
	 * @date 2018��7��15��  
	 * @version 1.0.0 
	 * 
	 * ��Ŀ����
	 * ţţ�õ���һ���ر�ͼ��˳�Ųر�ͼ��ָʾ��ţţ������һ���ر��У��ر�������һ�����أ�
	 * ����ÿ�λ���ʾ�����ַ��� s �� t�����ݹ��ϵĴ�˵��ţţ��Ҫÿ�ζ��ش� t �Ƿ��� s �������С�
	 * ע�⣬�����в�Ҫ����ԭ�ַ������������ģ����紮 abc�����������о��� {�մ�, a, b, c, ab, ac, bc, abc} 8 �֡�
	 * ��������:
	 * ÿ���������һ������������ÿ�����������������г��Ȳ����� 10 �Ĳ������ո�Ŀɼ� ASCII �ַ�����
	 * �������:
	 * ���һ�� ��Yes�� ���� ��No�� ��ʾ�����
	
	 * ʾ��1
	 * ����
	 * x.nowcoder.com
	 * ooo
	 * ���
	 * Yes
	 */
	public class Precious {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strA = br.readLine();
			String strB = br.readLine();
			
			String temp = strA;
			String[] splB = strB.split("");
			String result = "Yes";
			//boolean bool = true;
			for(int i=0;i<splB.length;i++){
				/*if(temp.contains(splB[i])){
					
					System.out.print("B[]="+splB[i]+"  ");
					int index = temp.indexOf(splB[i]);
					temp = temp.substring(index+1,temp.length());
					System.out.println("index:"+index+"now :"+temp);
				}else
					bool = false;*/
				int m = temp.indexOf(splB[i]);
				if(m != -1){
					temp = temp.substring(m+1);
					continue;
				}else
					result = "No";
			}
			System.out.println(result);
			/*if(bool){
				System.out.println("Yes");
			}else
				System.out.println("No");*/
		}
	}

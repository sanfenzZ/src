package src;

import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
public class Changer {
		/*Ҫ��
		 * �������10���������У�������е����ݼ������е���Ŀ
		 * 
		 * ˼·��
		 * ����һ�����飬����ʵ����������
		 * ѡ���������ŵ������Ƚϴ�С���ȽϵĽ���д��С����
		 * �������£���ƺ���NumBig()���Ƚϵ��������½��ġ���ά���顿��
		 * ���ú�������Ƚϣ��������֮ǰ�������ͷ��������У�С�Ļ���������
		 * С��������ƴ�ģ�
		 * **�������ʹ�õĶ�ά������Է���һ��
		 * Ȼ��ʵ�����
		 */
	static int arrnum = 0;//��ʶ����num���ߵ��ĸ�λ�ã�ʹ���ݲ��ظ�����
	static int childarr = 0;//��ʶ�����еĸ���
	static  int first = 0;//ȫ�ֱ���first�����ֵ��ӵ���ά����ǰһ��[]��λ��
	static int nine = 0;//���鵽num[9]���ñȽϣ���nine��ֵȷ���Ƿ���ӣ�û�еĻ����������������
	static float[] num = new float[11];//����numʵ�ֽ�ʮ�������ʵ������������
	static float[][] num1 = new float[11][20];//����num1���ȽϺ�����ַŽ������У�ʵ�����
	
	public static void main(String[] args) throws Exception{
		for(int i = 0;i < 10;i++){
			double f = (1+(Math.random()*10));
			int d = (int)(100*f); 
			num[i] = (float) (0.01*d);
		}
		System.out.println("���ɵ������ʵ���ǣ�");
		for(int i = 0;i<10;i++){
			
			System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("�����ĵ������ݼ����£�");
		
			for(;arrnum < 10;arrnum++){
			if(num[arrnum] > num[arrnum+1])//��һ������ǰһ����С
				NumSmall(arrnum);
			if(num[arrnum] < num[arrnum+1])//��һ������ǰһ������
				NumBig(arrnum);
		}
			PrintNum1(num1);//���������
			System.out.println();
		System.out.println("����"+childarr+"�������С�");
		
	}
	public static void NumBig(int n){//�Ƚ�num[n]��������Ƿ������������ǰ[]��ͬ�����У�������
		int i = 0;
		while(n < 9 && num[n] < num[n+1]){//n=9��ʱ��num[n]ָ���ʮ�������������ۼ�
			num1[first][i++] = num[n];//&&&&�����ֵ��������Ⱥ�˳��  **ȫ�ֱ��������� 
			n++;
			arrnum++;
	}
		num1[first][i++] = num[n];//////////////////////////////
		arrnum--;//ʵ�����ݼ�����ݼ����ٳ��Ե���
		first++;
}
	public static void NumSmall(int n){//�ʹ�Ĵ���һ��
		int i = 0;
		while(n < 9 && num[n] > num[n+1]){
			num1[first][i++] = num[n];
			n++;
			arrnum++;
	}
		num1[first][i++] = num[n];//////////////////////////////
		first++;
}
	public static void PrintNum1(float[][] num){//����ά�������������
		int i = 0;int j = 0;
		for(i = 0;i<10;i++){
			childarr++;
			System.out.print("(");
			for(j = 0;j<10;j++){
				if(num[i][0] == 0)//���ĳ����ά�����һ������0.0���Ͳ����������м���
					childarr--;
				if(num[i][j] == 0){
					break;
				}
			System.out.print(num[i][j]+",");
			}
			System.out.print("),");
			//System.out.println();
		}
	}
	
}
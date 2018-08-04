package str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��7��13��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * �� n ��ѧ��վ��һ�ţ�ÿ��ѧ����һ������ֵ��ţţ����� n ��ѧ���а���˳��ѡȡ k ��ѧ��
 * Ҫ����������ѧ����λ�ñ�ŵĲ���� d��ʹ���� k ��ѧ��������ֵ�ĳ˻����
 * ���ܷ������ĳ˻���
 * ��������:
 * ÿ��������� 1 ������������ÿ���������ݵĵ�һ�а���һ������ n (1 <= n <= 50)����ʾѧ���ĸ�����
 * ��������һ�У����� n ����������˳���ʾÿ��ѧ��������ֵ ai��-50 <= ai <= 50����
 * ��������һ�а�������������k �� d (1 <= k <= 10, 1 <= d <= 50)��
 * �������:
 * ���һ�б�ʾ���ĳ˻���

 * ʾ��1
 * ����
 * 3
 * 7 4 7
 * 2 50
 * ���
 * 49
 * https://www.nowcoder.com/questionTerminal/661c49118ca241909add3a11c96408c8
 */
public class SingTeam {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] arr = new int[n+1];
			for(int i=1;i<=n;i++)
				arr[i] = sc.nextInt();
			int kk = sc.nextInt();
			int dd = sc.nextInt();
			
			long[][] f = new long[n+1][kk+1];
			long[][] g = new long[n+1][kk+1];
			for(int one = 1;one<=n;one++){
				f[one][1] = arr[one];
				g[one][1] = arr[one];
			}
		
			
			for(int k=2;k<=kk;k++){
				for(int one = k;one<=n;one++){
					long tempmax = Long.MIN_VALUE;
					long tempmin = Long.MAX_VALUE;
					
					for(int left = Math.max(k-1,one-dd);left<=one-1;left++){
						if(tempmin > Math.min(f[left][k-1]*arr[one], g[left][k-1]*arr[one]))
							tempmin = Math.min(f[left][k-1]*arr[one], g[left][k-1]*arr[one]);
						
						if(tempmax < Math.max(f[left][k-1]*arr[one], g[left][k-1]*arr[one]))
							tempmax  = Math.max(f[left][k-1]*arr[one], g[left][k-1]*arr[one]);
					
					}
					f[one][k] = tempmax;
					g[one][k] = tempmin;
				}
			}
			
			long result = Long.MIN_VALUE;
			for(int one = kk;one<=n;one++){
				if(result < f[one][kk])
					result = f[one][kk];
			}
			
			System.out.println(result);
		}
	
	
	}
	
}

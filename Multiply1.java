package src;

/*
 * 题目描述
	给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
	其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
 */
public class Multiply1 {
	/*public int[] multiply(int[] A) {
		if(A.length < 1)
			return null;
		
		int[] B = new int[A.length];
		for(int i=0;i<A.length;i++){
			int mult = 1;
			for(int j=0;j<A.length;j++){
				System.out.println("A[j]:"+A[j]);
				if(i == j){
					mult = mult * 1;
				}else
					mult = mult * A[j];
			}
			B[i] = mult;
		}
		return B;
	}*/
	 public int[] multiply(int[] A) {
	        int length = A.length;
	        int[] B = new int[length];
	        if(length != 0 ){
	            B[0] = 1;
	            //计算下三角连乘
	            for(int i = 1; i < length; i++){
	                B[i] = B[i-1] * A[i-1];
	            }
	            /*for(int i=0;i<B.length;i++)
	    			System.out.println("B["+i+"]:"+B[i]);*/
	            int temp = 1;
	            //计算上三角
	            for(int j = length-2; j >= 0; j--){
	                temp *= A[j+1];
	                B[j] *= temp;
	                
	            }
	        }
	        return B;
	    }
	public static void main(String[] args){
		Multiply1 m = new Multiply1();
		int[] a = {1,2,3};
		int[] b = {};
		b = m.multiply(a);
		//for(int i=0;i<b.length;i++)
			//System.out.print(b[i]);
	}
}

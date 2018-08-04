package src;

import java.util.ArrayList;

public class Test {
	public int GetNumberOfK(int [] array , int k) {
	       ArrayList<Integer> arrlist = new ArrayList<>();
	        int start = 0;
	        int last = 0;
	        for(int i=0;i<array.length;i++)
	            arrlist.add(array[i]);
	        start = arrlist.indexOf(k);
	        last = arrlist.lastIndexOf(k);
	        System.out.println("last ="+ last);
	        if(last == -1)
	            return 0;
	        return last-start+1;
	        
	    }
	public static void main(String[] args){
		Test t = new Test();
		int[] array = {1,3,3,3,3,4,5};
		System.out.println(t.GetNumberOfK(array, 2));
	}
	/*public static void main(String[] args){
		Player p = new Player();
		try {
			p.play(4);
			p.play(14);
		} catch (NoThisSoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			//System.out.println("");
		}
		System.out.println("播放完成");
		}*/
}/*测试类*/

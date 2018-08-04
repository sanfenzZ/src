package str;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author me
 * @date 2018Äê6ÔÂ5ÈÕ  
 * @version 1.0.0 
 */
public class Maptest {
	public static void main(String[] args) {
		String str = "zxcvzxcvasdf";
		Map<String,Integer> m = new HashMap<String,Integer>();
		method(str,m);
	}
	
	public static void method(String str,Map<String,Integer> map){
		String[] str1 = str.split("");
		for(int i=0;i<str1.length;i++){
			Integer count  = 1;
			Integer value = map.get(str1[i]);
			if(value != null)
				count = value+1;
			map.put(str1[i], count);

		}
		
		Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
	//Set<Entry<String, Integer>> enterset = map.entrySet();
	//Iterator<Map.Entry<Integer,String>> it = enterset.iterator();
	while(it.hasNext()){
		Entry<String, Integer> me = it.next();
		String s = me.getKey();
		Integer i= me.getValue();
		System.out.println(s+"..."+i);
		
	}
	
	
	
	/*Set<Integer> key = map.keySet();
	Iterator<Integer> it = key.iterator();
	while(it.hasNext()){
		Integer i = it.next();
		String val = map.get(i);
		System.out.println(i+".."+val);*/
		
	}
	}

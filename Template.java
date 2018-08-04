package lab03;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Template {
	private Map<String, String> variableValue;
	private String templateValue;
	public Template(String string) {
		variableValue = new HashMap<String, String>();
		this.templateValue = string;
	}
	public void set(String string, String string2) {
		this.variableValue.put(string, string2);
	}

	public String evaluate() {
		String result = replaceVariable();
		checkForMissingValue(result);
		return result;
	}
   private String replaceVariable(){
	   String result = templateValue;
		for (Entry<String, String> entry : variableValue.entrySet()) {
			String regex = "\\$\\{" + entry.getKey() + "\\}";
			System.out.println(entry.getKey());
			result = result.replaceAll(regex, entry.getValue());
			System.out.println(result);
		}
		return result;
   }

   private void checkForMissingValue(String result) {
		Matcher m=Pattern.compile("\\$\\{.+\\}").matcher(result);
		if(m.find()){
		throw new missingValueException("No value for "+m.group());
		}
	}

	 @Test
	  public void oneVarilable()throws Exception{
		  Template template=new Template("Hello,${name}");
		  template.set("name","Reader");
		  template.set("aaa","Hi");
		  assertEquals("Hello,Reader",template.evaluate());
	  }
	 @Test
		public void missingVarilable()throws Exception{
			try {
				new Template("${foo}").evaluate();
				fail("evaluate()方法出现异常，原因为未给变量赋值");
			} catch (missingValueException e) {
				assertEquals("No value for ${foo}",e.getMessage());
			}
		}


}

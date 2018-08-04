package lab03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestTemplate {
	private Template template;
	@Before
	public void setUp()throws Exception{
		template = new Template("${one},${two},${three}");
		template.set("one", "1");
		template.set("two", "2");
		template.set("three", "3");}
	@Test
	public void multipleVarilable() throws Exception {
		assertTemplate("1,2,3");}
	@Test
	public void unknowVarilable()throws Exception{
		template.set("doesnotexist", "Hi");
		assertTemplate("1,2,3");
	}
	public void assertTemplate(String str){
		assertEquals(str, template.evaluate());
	}
}

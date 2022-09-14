package w3school.scripts;

import org.testng.annotations.Test;

public class A {
	
	public String un;
	public String pwd;
	public String testType;
	
	public A(String un, String pwd, String testType) {
		this.un = un;
		this.pwd = pwd;
		this.testType =testType;
	}
	
	@Test(priority=1)
	public void one() {
		System.out.println("Module A Test 1 Validated using "+testType+" >>>> "+un+" & "+pwd);
	}
	
	@Test(priority=2)
	public void two() {
		System.out.println("Module A Test 2 Validated using "+testType+" >>>> "+un+" & "+pwd);
	}
	
	@Test(priority=3)
	public void three() {
		System.out.println("Module A Test 3 Validated using "+testType+" >>>> "+un+" & "+pwd);
	}

}

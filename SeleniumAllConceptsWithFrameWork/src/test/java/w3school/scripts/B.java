package w3school.scripts;

import org.testng.annotations.Test;

public class B {
	
	public String un;
	public String pwd;
	public String testType;
	
	public B(String un, String pwd, String testType) {
		this.un = un;
		this.pwd = pwd;
		this.testType =testType;
	}
	
	@Test(priority=4)
	public void one() {
		System.out.println("Module B Test 1 Validated using "+testType+" >>>> "+un+" & "+pwd);
	}
	
	@Test(priority=5)
	public void two() {
		System.out.println("Module B Test 2 Validated using "+testType+" >>>> "+un+" & "+pwd);
	}
	
	@Test(priority=6)
	public void three() {
		System.out.println("Module B Test 3 Validated using "+testType+" >>>> "+un+" & "+pwd);
	}

}

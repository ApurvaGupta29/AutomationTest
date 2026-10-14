package TestN;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNClass3 {
	@Test
	public void method2() {
		System.out.println("Test case");
	}

	@Test
	public static void method11() {
		System.out.println("Test case 1");

	}

	@BeforeSuite
	public void bs() {
		System.out.println("BS");

	}

	@BeforeTest
	public void bt() {
		System.out.println("BT");

	}

	@BeforeClass
	public void bc() {
		System.out.println("BC");

	}

	@BeforeMethod // bodyguard
	public void bm() {
		System.out.println("BM");

	}

	@AfterSuite
	public void as() {
		System.out.println("AS");

	}

	@AfterTest
	public void at() {
		System.out.println("AT");

	}

	@AfterClass
	public void ac() {
		System.out.println("AC");

	}

	@AfterMethod // bodyguard
	public void am() {
		System.out.println("AM");

	}
}

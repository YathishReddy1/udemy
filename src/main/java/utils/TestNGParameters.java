package utils;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGParameters {

	@Test
	@Parameters({"Myname"})
	public void test(@Optional ("sohith")String name) {
		System.out.println("My name is :" + name);
	}
}

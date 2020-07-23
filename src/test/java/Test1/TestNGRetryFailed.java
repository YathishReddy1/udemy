package Test1;

import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import junit.framework.Assert;

public class TestNGRetryFailed {

	@Test
	public void test1() {

		System.out.println("this is test 1");
	}

	@Test(retryAnalyzer = Test1.MyRetry.class)
	public void test2() {

		System.out.println("this is test 2");
		int i = 1 / 0;
	}

	@Test
	public void test3() {

		System.out.println("this is test 3");
		Assert.assertTrue(0>1);
	}
}

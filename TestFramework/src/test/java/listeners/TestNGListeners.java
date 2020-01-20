package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("start "+result.getName());

	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("success "+result.getName());

	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("failed  "+result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped "+result.getName());

	}
	
	public void onStart(ITestContext context) {
		System.out.println("finished "+context.getName());

	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("finished "+context.getName());

	}
}

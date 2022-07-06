package TestNGListeners;

import BrowserStackCases.BrowserStackTestNGTest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Success of test cases and its details are : "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName());
        BrowserStackTestNGTest.jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"Failed\", \"reason\": \"Actual is not matching with Expected\"}}");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Skip of test cases and its details are : "+result.getName());
    }

}

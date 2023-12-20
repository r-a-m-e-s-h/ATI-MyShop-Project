package com.MyStore.testCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MyShop_listener implements ITestListener {


	public interface ITestListener extends ITestNGListener {

		public static void onTestStart(ITestResult result) {
			// not implemented
			System.out.println(" Test Case execution Started ");
		}

		public static void onTestSuccess(ITestResult result) {
			// not implemented
			System.out.println("Testcase got success");
		}


		public static void onTestFailure(ITestResult result) {
			// not implemented
			System.out.println("testCase Failed");
		}


		public static void onTestSkipped(ITestResult result) {
			// not implemented
			System.out.println("Test case skipped");
		}


		/*
		 * public static void onTestFailedButWithinSuccessPercentage(ITestResult result)
		 * { // not implemented }
		 * 
		 * 
		 * public static void onTestFailedWithTimeout(ITestResult result) {
		 * onTestFailure(result); }
		 */


		public static void onStart(ITestContext context) {
			// not implemented
			System.out.println("Test execution started");
		}


		public static void onFinish(ITestContext context) {
			// not implemented
			System.out.println("Test execution finished");
		}

	}
}

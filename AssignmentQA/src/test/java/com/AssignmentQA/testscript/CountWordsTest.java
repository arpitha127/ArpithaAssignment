package com.AssignmentQA.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentQA.POM.AssignmentQAPage;
import com.AssignmentQA.genericLib.Base;

public class CountWordsTest extends Base {
	@Test
	public void test() {
	AssignmentQAPage qa=new AssignmentQAPage(driver);
	String count = qa.getOccurance("hello", "hello world hello");
	
	Assert.assertEquals(count, "2");
	
	}

}

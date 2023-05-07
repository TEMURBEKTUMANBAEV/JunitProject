package com.automation.testcases;

import com.automation.categories.RegressionTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SearchFunctionalityTest extends BaseTest {
    @Test
    @Category(RegressionTest.class)
    public void verifySearchResultsAreDisplayed(){
        System.out.println("verify search result");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifyMessageWhenThereAreNoResult() {
        System.out.println("verify no result message");
    }
    @Test
    @Category(RegressionTest.class)
    public void verifySearchResultHasSearchKeyword() {
        System.out.println("verify search result has search keyword");
    }
}

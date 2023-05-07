package com.automation.runner;

import com.automation.categories.RegressionTest;
import com.automation.testcases.CartPageTest;
import com.automation.testcases.LoginTest;
import com.automation.testcases.SearchFunctionalityTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({CartPageTest.class, LoginTest.class, SearchFunctionalityTest.class})
@Categories.IncludeCategory(RegressionTest.class)
public class GroupRunner {

}

package com.it.Tests;

import com.it.App;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected static App app = new App();

    @AfterSuite
    public void tearDownSuit() {
        app.common.closeApp();
    }
}


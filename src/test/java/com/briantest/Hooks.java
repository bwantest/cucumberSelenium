package com.briantest;

import org.junit.After;
import org.junit.Before;

/**
 * Created by brianwan on 12/08/2017.
 */
public class Hooks {
    @Before
    public void setup() {
        new DriverManager().openBrowser();
    }

    @After
    public void after() {
        new DriverManager().closeBrowser();
    }
}


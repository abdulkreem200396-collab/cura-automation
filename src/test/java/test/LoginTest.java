package test;

import org.junit.jupiter.api.Test;

import base.BaseTest;
import pages.HomePage;

public class LoginTest extends BaseTest{
@Test
public void testStart() {
	HomePage home = new HomePage(driver);
	home.clickMakeAppointment();
}
}

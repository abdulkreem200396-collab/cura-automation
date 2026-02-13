package test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.AppointmentPage;

import org.junit.jupiter.api.Test;

public class BookingTest extends BaseTest {

    @Test
    void bookAppointment(){

        HomePage home = new HomePage(driver);
        home.clickMakeAppointment();

        LoginPage login = new LoginPage(driver);
        login.login("John Doe","ThisIsNotAPassword");

        AppointmentPage appointment = new AppointmentPage(driver);
        appointment.book("20/02/2026","automation test");
    }
}

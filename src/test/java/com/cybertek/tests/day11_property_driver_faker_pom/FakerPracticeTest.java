package com.cybertek.tests.day11_property_driver_faker_pom;

import com.cybertek.utility.TestBase;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerPracticeTest extends TestBase {

    @Test
    public void testPrintFakeData(){
        Faker faker=new Faker();
        System.out.println("Full Name = " + faker.name().fullName());

        //fake book info
        System.out.println("Book title = " + faker.book().title());
        System.out.println("Phone number = " + faker.phoneNumber().cellPhone());
        System.out.println("faker.hitchhikersGuideToTheGalaxy() = " + faker.hitchhikersGuideToTheGalaxy());
    }
}

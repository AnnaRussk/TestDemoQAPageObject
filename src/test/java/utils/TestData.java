package utils;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String phone = faker.phoneNumber().subscriberNumber(10);
}

package ru.netology.Data;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static ru.netology.Data.RegistrationInfo.*;

@UtilityClass
public class DataGenerator {


    @UtilityClass
    public static class Registration {
        public static ru.netology.Data.RegistrationInfo generateInfo (String locale){
            Faker faker = new Faker(new Locale(locale));
            return new ru.netology.Data.RegistrationInfo(
                    faker.address().cityName(),
                    faker.name().fullName(),
                    faker.phoneNumber().phoneNumber() + "+".replaceAll("\\D+", ""));
        }
    }

    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
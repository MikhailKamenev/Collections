package Passport;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PassportsRepository {
    private Map<String, Passport> passports = new HashMap<>();

    public void addPassport(Passport passport) {
        if (passports.containsKey(passport.getNumber())) {
            passports.replace(passport.getNumber(), passport);
        } else {
            passports.put(passport.getNumber(), passport);
        }
    }

    public void findPassport(String number) {
        passports.get(number);
    }

    @Override
    public String toString() {
        return "Список паспортов: " + passports;
    }
}

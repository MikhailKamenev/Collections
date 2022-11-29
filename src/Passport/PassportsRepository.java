package Passport;

import java.util.HashSet;
import java.util.Set;

public class PassportsRepository {
    private Set<Passport> passports = new HashSet<>();

    public void addPassport(Passport passport) {
        this.passports.add(passport);
    }

    public Passport find(String number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}

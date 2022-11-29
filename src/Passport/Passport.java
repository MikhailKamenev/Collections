package Passport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Passport {
    private final String number;
    private String name;
    private LocalDate localDate;

    public Passport(String number, String name, LocalDate localDate) throws IncorrectData {
        if (number == null || number.isEmpty() || number.isBlank()
                || name == null || name.isEmpty() || name.isBlank()) {
            throw new IncorrectData("Неверные данные паспорта");
        }
        this.number = number;
        this.name = name;
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return getNumber().equals(passport.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public LocalDate getLocalDate() {
        return localDate;
    }
}

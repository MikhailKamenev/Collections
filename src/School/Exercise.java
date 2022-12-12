package School;

import java.util.Objects;

public class Exercise {
    private final int value1;
    private final int value2;

    public Exercise(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    @Override
    public String toString() {
        return String.format("%s*%s = ?",this.value1,this.value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return (value1 == exercise.value1&&value2== exercise.value2)||(value1 == exercise.value2&&value2== exercise.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1*value2);
    }
}

package School;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private Set<Exercise> exercises = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (exercises.size() < 15) {
            exercises.add(new Exercise(random.nextInt(10), random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "exercises=" + exercises +
                '}';
    }
}

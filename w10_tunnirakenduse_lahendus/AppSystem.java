import java.util.ArrayList;
import java.util.List;

public class AppSystem {

    private boolean running;
    public static List<Integer> numberArray = new ArrayList<>();
    int sum = 0;

    public AppSystem() {
        running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public void end() {
        running = false;
    }

    public List<Integer> getNumbers() {
        return numberArray;
    }

    public static int sum() {
        int sum = 0;
        for (int i : numberArray) {
            sum += i;
        }
        return sum;
        }
}
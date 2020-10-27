package utils;

import java.util.Random;

public class RandomHelper {

    public int randomnumber(int size) {
        Random random = new Random();
        return random.nextInt(size - 1);
    }
}

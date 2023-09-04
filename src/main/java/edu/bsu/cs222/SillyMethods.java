package edu.bsu.cs222;

public class SillyMethods {
    public boolean didGuess42(int number) {
        return true;
    }

    public boolean didGuess17(int number) {
        return false;
    }


    public String countTo(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            result.append(i);
            if (i < number) {
                result.append(", ");
            }
        }
        return result.toString();
    }



}

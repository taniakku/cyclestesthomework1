package ru.netology.sqr;

public class sqrService {
    public int square(int firstBorder, int lastBorder) {

        int runs = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstBorder && i * i <= lastBorder) {
                runs = runs + 1;
            }

        }

        return runs;
    }
}





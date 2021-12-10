package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCountSquare() {
        SQRService SQRService = new SQRService();
        int firstBorder = 200;
        int lastBorder = 300;


        int expected = 3;
        int actual = SQRService.square(firstBorder, lastBorder);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSquareFromZero() {
        SQRService SQRService = new SQRService();
        int firstBorder = 0;
        int lastBorder = 100;


        int expected = 1;
        int actual = SQRService.square(firstBorder, lastBorder);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSquareToThousands() {
        SQRService SQRService = new SQRService();
        int firstBorder = 0;
        int lastBorder = 10000;


        int expected = 90;
        int actual = SQRService.square(firstBorder, lastBorder);

        assertEquals(expected, actual);
    }
}
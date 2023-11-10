package org.jesusfercan.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TimedReadingTest {

    @Test
    public void basicTests() {
        doTest(4, "The Fox asked the stork, 'How is the soup?'", 7);
        doTest(1, "...", 0);
        doTest(3, "This play was good for us.", 3);
        doTest(3, "Suddenly he stopped, and glanced up at the houses", 5);
        doTest(6, "Zebras evolved among the Old World horses within the last four million years.", 11);
        doTest(5, "Although zebra species may have overlapping ranges, they do not interbreed.", 6);
        doTest(1, "Oh!", 0);
        doTest(5, "Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain.", 14);
    }
    private void doTest(final int maxLength, final String text, final int expected) {
        assertEquals(expected, TimedReading.timedReading(maxLength, text));
    }

    @Test
    public void basicTests01() {
        doTest01(4, "The Fox asked the stork, 'How is the soup?'", 7);
        doTest01(1, "...", 0);
        doTest01(3, "This play was good for us.", 3);
        doTest01(3, "Suddenly he stopped, and glanced up at the houses", 5);
        doTest01(6, "Zebras evolved among the Old World horses within the last four million years.", 11);
        doTest01(5, "Although zebra species may have overlapping ranges, they do not interbreed.", 6);
        doTest01(1, "Oh!", 0);
        doTest01(5, "Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain.", 14);
    }

    private void doTest01(final int maxLength, final String text, final int expected) {
        assertEquals(expected, TimedReading.timedReading01(maxLength, text));
    }


    @Test
    public void basicTests02() {
        doTest02(4, "The Fox asked the stork, 'How is the soup?'", 7);
        doTest02(1, "...", 0);
        doTest02(3, "This play was good for us.", 3);
        doTest02(3, "Suddenly he stopped, and glanced up at the houses", 5);
        doTest02(6, "Zebras evolved among the Old World horses within the last four million years.", 11);
        doTest02(5, "Although zebra species may have overlapping ranges, they do not interbreed.", 6);
        doTest02(1, "Oh!", 0);
        doTest02(5, "Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain.", 14);
    }

    private void doTest02(final int maxLength, final String text, final int expected) {
        assertEquals(expected, TimedReading.timedReading02(maxLength, text));
    }
}

package org.jesusfercan.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class RotationsTest {
    private static void testing(Boolean actual, Boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        LocalTime lt = LocalTime.now();
        System.out.println("Fixed Tests containAllRots");
        testing(Rotations.containAllRots("", Arrays.asList()), true);
        List<String> a = Arrays.asList("bsjq", "qbsj");
        testing(Rotations.containAllRots("", a), true);
        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        testing(Rotations.containAllRots("bsjq", a), true);
        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        testing(Rotations.containAllRots("XjYABhR", a), false);
        System.out.println((LocalTime.now().toNanoOfDay() - lt.toNanoOfDay())*1e+9);
    }

    @Test
    public void test01() {
        LocalTime lt = LocalTime.now();
        System.out.println("Fixed Tests containAllRots 01");
        testing(Rotations.containAllRots01("", Arrays.asList()), true);
        List<String> a = Arrays.asList("bsjq", "qbsj");
        testing(Rotations.containAllRots01("", a), true);
        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        testing(Rotations.containAllRots01("bsjq", a), true);
        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        testing(Rotations.containAllRots01("XjYABhR", a), false);
        System.out.println((LocalTime.now().toNanoOfDay() - lt.toNanoOfDay())*1e+9);
    }
}

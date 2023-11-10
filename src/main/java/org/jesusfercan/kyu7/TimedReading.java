package org.jesusfercan.kyu7;

import java.util.Arrays;

/*
Timed Reading is an educational tool used in many schools to improve and advance reading skills. A young elementary student has just finished his very first timed reading exercise. Unfortunately he's not a very good reader yet, so whenever he encountered a word longer than maxLength, he simply skipped it and read on.

Help the teacher figure out how many words the boy has read by calculating the number of words in the text he has read, no longer than maxLength.

Formally, a word is a substring consisting of English letters, such that characters to the left of the leftmost letter and to the right of the rightmost letter are not letters.

Example
For maxLength = 4 and text = "The Fox asked the stork, 'How is the soup?'", the output should be 7

The boy has read the following words: "The", "Fox", "the", "How", "is", "the", "soup".

Input/Output
[input] integer maxLength

A positive integer, the maximum length of the word the boy can read.

Constraints: 1 ≤ maxLength ≤ 10.

[input] string text

A non-empty string of English letters and punctuation marks.

[output] an integer

The number of words the boy has read.

https://www.codewars.com/kata/588817db5fb13af14a000020/train/java
 */
public class TimedReading {

    public static int timedReading(final int maxLength, final String text) {

        return Arrays.stream(text.split(" ")).mapToInt(s -> s.replaceAll("[^a-zA-Z]","").length()<=maxLength&&!s.replaceAll("[^a-zA-Z]","").isEmpty()?1:0).sum(); //coding and coding.
    }

    // CODES BY OTHERS DEVELOPERS

    public static int timedReading01(final int maxLength, final String text) {
        String[] words = text.split("\\W+");
        return (int) Arrays.stream(words).filter(w -> !w.isEmpty() && w.length() <= maxLength).count();
    }

    static int timedReading02(int maxLength, String text) {
        return (int) Arrays.stream(text.replaceAll("[^a-zA-Z ]", "").split(" "))
                .filter(w -> w.length() <= maxLength && !w.isEmpty()).count();
    }
}

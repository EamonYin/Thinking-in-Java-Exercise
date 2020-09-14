package Chapter19.Test5;/* Modify contol/VowelsAndConsonants.java so that it uses three enum types:
 * VOWEL, SOMETIMES_A_VOWEL, and, CONSONANT. The enum constructor should
 * take the various letters that describe that particular category. Hint:
 * use varargs, and remember that varargs automatically creates an array
 * for you.
 */

import java.util.*;

import static net.mindview.util.Print.*;

enum A {
    VOWEL('a', 'o', 'e', 'i', 'u'), SOMETIMES_A_VOWEL('y', 'w'), CONSONANT('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
    private Character[] ch;

    private A(Character... letters) {
        ch = letters;
    }

    public static A letterType(Character c) {
        if (Arrays.asList(VOWEL.ch).contains(c)) return VOWEL;
        else if (Arrays.asList(SOMETIMES_A_VOWEL.ch).contains(c)) return SOMETIMES_A_VOWEL;
        else return CONSONANT;
    }
}

public class Test5 {
    public static void main(String[] args) {
        print(A.letterType('Y').name());
    }
}
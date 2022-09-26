import java.util.*;
import java.util.stream.Collectors;

class StringConcatenation {
    public static void main(String args[]) {
        /*
         * By + (String concatenation) operator
         */
        String s1 = "Ramesh" + "Suresh";
        System.out.println(s1); // RameshSuresh

        /*
         * String concatenation by conact operator
         */

        String s3 = "Ramesh";
        String s4 = "Suresh";

        String s5 = s3.concat(s4);
        System.out.println(s5);// RameshSuresh

        /*
         * String concatenation using String builder class
         * StringBuilder is class provides append() method
         */
        StringBuilder s6 = new StringBuilder("Hello");
        StringBuilder s7 = new StringBuilder("Learner");
        StringBuilder s9 = s6.append(s7);
        System.out.println(s9.toString()); // HelloLearner

        /*
         * String concatenation using format() method
         */
        String str1 = new String("Good");
        String str2 = new String("morning");
        String str3 = String.format("%str3%str3", str1, str2);
        System.out.println(); // Good morning

        /*
         * String joining using join() method
         */
        String str4 = String.join("", str1, str2);
        System.out.println(str4.toString()); // Good morning

        /*
         * String concatenatin using Collectors.joining() method
         */
        List<String> list = Arrays.asList("abc", "pqr", "xyz");
        String str = list.stream().collect(Collectors.joining(","));
        System.out.println(str.toString()); // abc, pqr, xyz

    }
}

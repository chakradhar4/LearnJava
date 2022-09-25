class StringCompare {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "sachin";
        String s3 = "Saurav";
        String s4 = "SACHIN";
        String s5 = "Sachin";
        String s6 = new String("Sachin");
        // compare strings using equals() method
        // string compares content the two strings
        // 1] public boolean equals(Object another) compares this string to the
        // specified
        // object

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // false

        // 2] public boolean equalsIgnoreCase(String another) compares this string to
        // another string, ignoring case.

        System.out.println(s1.equalsIgnoreCase(s4)); // true
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // 3] by using == operator
        // == operator compares refereneces not values
        System.out.println(s1 == s5); // true
        System.out.println(s1 == s6); // false
        System.out.println(s1 == s4); // false
        // 4 ] comapreTo()
        // compares values lexicographically and returns an integer value that describes
        // if first string is less than, equal to or greater than second string.
        /*
         * s1 == s2 : The method returns 0.
         * s1 > s2 : The method returns a positive value.
         * s1 < s2 : The method returns a negative value.
         */
        String s8 = "R";
        String s9 = "r";
        System.out.println(s8.compareTo(s9)); // negative values
        System.out.println(s9.compareTo(s8)); // positive value
    }
}

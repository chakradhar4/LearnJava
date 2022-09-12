/*
 string is basically an object that represents sequence of char values.
 BasicImplementation of String
 */
class StringImplementation {
    public static void main(String[] args) {
        // here str and str2 have will have same value and location
        // they will point towards the same object in String pool
        String str = "john";
        System.out.println(str);
        String str2 = "john";

        // Creating String using new keyword
        // here string object will be in heap and john in string constant pool
        String str3 = new String("john");
        // array of character work same as String
        // converting array to String
        char[] arr = { 'j', 'o', 'h', 'n' };
        // creating string with new keyword
        String string = new String(arr);
        System.out.println(string);

    }
}
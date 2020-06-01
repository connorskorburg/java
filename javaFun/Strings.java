public class Strings {
    public static void main(String[] args) {
        // length
        String hello = "Hello World";
        int length = hello.length();
        System.out.println("String Length is " + length );
        // concatenate
        String val1 = "My Name is ";
        String val2 = "Connor";
        String val3 = val1.concat(val2); // or val1 + val2
        System.out.println(val3);
        //format 
        String myString = String.format("Hello %s, you owe me $%.2f", "Bob", 55.0);
        System.out.println(myString);
        //indexOf - method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found
        String hello2 = "Hello World Again!";
        int a = hello2.indexOf("World");
        int b = hello2.indexOf("lo");
        int c = hello2.indexOf("pizza"); //-1, not found
        System.out.println("A " + a);
        System.out.println("B " + b);
        System.out.println("C " + c);
        //trim - method removes any trailing or leading white spaces from the string
        String sentence = "    spaces everwhere!     ";
        System.out.println(sentence.trim());
        // upper/lowercase
        String x = "HELLO";
        String y = "world";
        System.out.println(x.toLowerCase());
        System.out.println(y.toUpperCase());
        // Equality
        String val5 = new String("word");
        String val6 = new String("word");
        System.out.println(val5 == val6); //false, not the same exact object
        System.out.println(val5.equals(val6)); //true, same exact characters
    }
}
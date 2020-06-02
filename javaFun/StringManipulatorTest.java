public class StringManipulatorTest {
    public static void main(String[] args ) {
        // trim and concat
        StringManipulator manipulator = new StringManipulator();
        String new_str = manipulator.trimAndConcat("   Hello   ","   World   ");
        System.out.println(new_str);
        // index of or null string, char
        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Hello", letter);
        Integer b = manipulator2.getIndexOrNull("Coding Dojo", letter);
        Integer c = manipulator2.getIndexOrNull("Pizza", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // index of or null string, string
        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString ="llo";
        String notSubString = "world";
        Integer x = manipulator3.getIndexOrNull(word, subString);
        Integer y = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(x);
        System.out.println(y);
        // concat substring
        StringManipulator manipulator4 = new StringManipulator();
        String new_word = manipulator4.concatSubString("Hello", 1, 2, "world");
        System.out.println(new_word);
    }
}
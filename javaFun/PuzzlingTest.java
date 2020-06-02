import java.util.ArrayList;
public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling test = new Puzzling();
        //print sum and return arr with vals greater than 10
        int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(test.printSum(arr1));
        // print shuffled names and return arr with names longer than 5 characters
        String[] arr2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(test.printNames(arr2));
        // shuffle alphabet
       char[] arr3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        test.shuffleAlphabet(arr3);
        //random array with 10 numbers from 55-100
        test.randomArr();
        //sort random array with 10 random numbers from 55-100
        test.sortRandomArr();
        //random string that is 5 characters
        System.out.println(test.randomStr());
        //list of 10 random strings with 5 characters
        test.randomStrList();
    }
}
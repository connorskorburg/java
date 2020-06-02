import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Puzzling {
    public ArrayList<Integer> printSum(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr;
    }
    public ArrayList<String> printNames(String[] arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        ArrayList<String> namesList = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++) {
            namesList.add(arr[i]);
            String name = arr[i];
            System.out.println(name);
            if(name.length() > 5) {
                newArr.add(arr[i]);
            }
        }
        Collections.shuffle(namesList);
        return newArr;
    }
    public void shuffleAlphabet(char[] arr) {
        ArrayList<Character> newArr = new ArrayList<Character>();
        for(int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        Collections.shuffle(newArr);
        // System.out.println(newArr);
        newArr.get(0);
        newArr.get(25);
        if("aeiou".indexOf(newArr.get(0)) >= 0){
            System.out.println("The first letter is vowel! - " + newArr.get(0));
            System.out.println("Last Letter: " + newArr.get(25));
        }
        else {
            System.out.println("First letter: " + newArr.get(0));
            System.out.println("Last Letter: " + newArr.get(25));
        }
    }
    public ArrayList<Integer> randomArr() {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            int rand = r.nextInt(100-55) + 55;
            newArr.add(rand);
        }
        System.out.println(newArr);
        return newArr;
    }
    public ArrayList<Integer> sortRandomArr() {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            int rand = r.nextInt(100-55) + 55;
            newArr.add(rand);
        }
        Collections.sort(newArr);
        System.out.println(newArr);
        System.out.println(newArr.get(0));
        System.out.println(newArr.get(9));
        return newArr;
    }
    public String randomStr() {
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        String word = "";
        for(int i = 0; i < 5; i++) {
            int randNum = r.nextInt(25);
            word = word + alphabet.charAt(randNum);
        }
        return word;
    }
    public ArrayList<String> randomStrList() {
        ArrayList<String> newArr = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            newArr.add(randomStr());
        }
        System.out.println(newArr);
        return newArr;
    }
}
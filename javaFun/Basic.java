import java.util.ArrayList;
public class Basic {
    public void print255() { 
        for(int i = 1; i < 256; i++) { 
            System.out.println(i);
        }
    }
    public void printOdd255() {
        for( int i = 1; i < 256; i++ ) { 
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
    public void printSum() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            sum = sum + i;
            System.out.println("New Number: " + i);
            System.out.println("Sum: " + sum);
        }
    }
    public void iterateArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void maxArr(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void printAvg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }
    public void arrOdd() {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++) {
            if(i % 2 == 1) {
                newArr.add(i);
            }
        }
        System.out.println(newArr);
    }
    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y) {
                count = count + 1;
            }
        }
        System.out.println("Count: " + count);
    }
    public void squareValues(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            newArr.add(arr[i] * arr[i]);
        }
        System.out.println(newArr);
    }
    public void removeNeg(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                newArr.add(0);
            }
            else{
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }
    public void maxMinAvg(int[] arr) {
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int avg = sum / arr.length;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        newArr.add(max);
        newArr.add(min);
        newArr.add(avg);
        System.out.println(newArr);
    }
    public void shiftValues(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 1; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        newArr.add(0);
        System.out.println(newArr);
    }
}
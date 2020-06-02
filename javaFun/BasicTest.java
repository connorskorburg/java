public class BasicTest {
    public static void main ( String[] args ) {
        Basic number = new Basic();
        // print 1 to 255 
        number.print255();
        // print odds to 255
        number.printOdd255();
        // print sum to 255
        number.printSum();
        //iterate through array
        int[] arr1 = {1,3,5,7,9,13};
        number.iterateArr(arr1);
        //max arr
        int[] arr2 = {-3,-5,-7, 10, 34, 200, -12, 0, 1};
        number.maxArr(arr2);
        // print avg
        int[] arr3 = {2,10,3};
        number.printAvg(arr3);
        // print odd arr 1-255
        number.arrOdd();
        // how many vals greater than y
        int[] arr4 = {1,3,5,7};
        int y = 3;
        number.greaterThanY(arr4, y);
        //square values
        int[] arr5 = {1,5,10,-2};
        number.squareValues(arr5);
        // remove negative numbers
        int[] arr6 = {1,5,10,-2,6,-7};
        number.removeNeg(arr6);
        //max min avg
        number.maxMinAvg(arr5);
        //shifting values
        int[] arr7 = {1,5,10,7,-2};
        number.shiftValues(arr7);
    }
}
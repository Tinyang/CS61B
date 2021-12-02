package office;

import java.util.Arrays;

public class Arrays23 {

    /*Consider a method that inserts an int item into an int[] arr at the given position.
    The method should return the resulting array. For example, if x = [5, 9, 14, 15],
    item = 6, and position = 2, then the method should return [5, 9, 6, 14, 15].
    If position is past the end of the array, insert item at the end of the array.
    Is it possible to write a version of this method that returns void and changes arr in
    place (i.e., destructively)? Hint: These arrays are filled meaning an array containing
    n elements will have length n.*/

    public static int[] insert(int[] arr, int item, int position) {
        if (position < 0) {throw new IllegalArgumentException();}
        if (position > arr.length) {position = arr.length;}
        int[] newArr = new int[arr.length + 1];
        int index = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (position == i) {
                newArr[position] = item;
            } else {
                newArr[i] = arr[index];
                index ++;
            }
        }
        return newArr;
    }

    /*Consider a method that destructively reverses the items in arr. For example calling
    reverse on an array [1, 2, 3] should change the array to be [3, 2, 1]. Write
    the reverse method:*/
    public static void reverse(int[] arr) {
        int length = arr.length;
        int middle = length / 2;
        for (int i = 0; i < middle; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }


    /*Write a non-destructive method replicate(int[] arr) that replaces the
    number at index i with arr[i] copies of itself. For example, replicate([3, 2,
            1]) would return [3, 3, 3, 2, 2, 1]. For this question assume that all elements
    of the array are positive.*/
    public static int[] replicate(int[] arr) {
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            newSize += arr[i];
        }
        int[] newArr = new int[newSize];

        int index = 0;
        int value = arr[index];
        int temp = arr[index];
        for (int i = 0; i < newArr.length; i++) {
            if (temp <= 0) {
                index++;
                value = arr[index];
                temp = arr[index];
            }
            temp --;
            newArr[i] = value;
        }
        return newArr;
    }



    public static void main(String[] args) {
        int[] array0 = new int[]{5, 9, 14, 15};
        System.out.println(Arrays.toString(insert(array0, 6, 20)));

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{3, 2, 4, 1};
        System.out.println(Arrays.toString(replicate(array2)));
    }

}

package Homework6;

/**
 * Написать программу на любом языке в любой парадигме для
 * бинарного поиска. На вход подаётся целочисленный массив и
 * число. На выходе - индекс элемента или -1, в случае если искомого
 * элемента нет в массиве.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 2, 3, 10, 40};
        int targetValue = 1;
        System.out.println(binarySearch(arr,targetValue));

    }

    public static int binarySearch (int[] arr, int target){
        return binarySearch(arr,target,0,arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else  if (arr[mid] == target){
                return mid;
            }
        }
        return - 1;
    }
}

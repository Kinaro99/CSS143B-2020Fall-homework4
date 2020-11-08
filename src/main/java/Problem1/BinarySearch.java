package Problem1;

// https://www.geeksforgeeks.org/binary-search/

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
       if (data.length == 0 ) {
           return 0;
       } else {
           return binarySearchHelper(data, target, 0, data.length-1);
       }
    }

    private static int binarySearchHelper(int[] data, int target, int start, int end) {
        int mid = (start + end)/2;

        if (start < end) {
            return 0;
        }

        if(target == data[mid]) {
            return mid;
        } else if (target > data[mid]) {
            return binarySearchHelper(data, target, mid+1, end);
        } else {
            return binarySearchHelper(data, target, start, mid+1);
        }
    }
}

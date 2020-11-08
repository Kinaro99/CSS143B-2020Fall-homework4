package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(0, nums, result);
        return result;
    }

    private static void permute(int i, int[] nums, List<List<Integer>> result) {
        if (i == nums.length-1) {
            List<Integer> listOne = new ArrayList<>();

            for(int j=0; i< nums.length; i++) {
                listOne.add(nums[j]);
            }
            result.add(listOne);

        } else {
            for (int k = i; i<nums.length; i++) {
                /*temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;*/
                swap(nums, k, i);
                permute(i+1, nums,result);
                swap(nums, k, i);
                /*temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;*/
            }

        }
    }

    private static void swap(int[] nums, int k, int i) {
        if(i == k) {
            return;
        }

        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
    }

}

//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
//https://www.programcreek.com/2013/02/leetcode-permutations-java/ -> used this
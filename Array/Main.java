package Array;
import java.util.Stack;


public class Main{
	
	public static double medianofTwoSortedArrays(int[] nums1 , int[] nums2) {
	
	if (nums1.length > nums2.length) {
        return medianofTwoSortedArrays(nums2, nums1);
    }

    int m = nums1.length;
    int n = nums2.length;
    int totalLength = m + n;
    int half = (totalLength + 1) / 2;

    int left = 0;
    int right = m;

    while (left <= right) {
        int partition1 = (left + right) / 2;
        int partition2 = half - partition1;

        // Edge cases where partition is at the boundary
        int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
        int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

        int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
        int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

        // Check if we have a valid partition
        if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
            // If total number of elements is odd
            if (totalLength % 2 == 1) {
                return Math.max(maxLeft1, maxLeft2);
            }
            // If total number of elements is even
            return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        } else if (maxLeft1 > minRight2) {
            // Move partition1 to the left
            right = partition1 - 1;
        } else {
            // Move partition1 to the right
            left = partition1 + 1;
        }
    }

    throw new IllegalArgumentException("Input arrays are not sorted.");
	}
	
	
	
	
public static void main ( String [] args)
{
	
	int[] arr = {1,2,3,4,6};
	int[] array = arr;
	
	for(int i = 0 ; i < array.length ; i++) {
		System.out.print(array[i])
;	}
	
	System.out.println();
    arr[4] = 5;
    
    for(int i : arr) {
    	System.out.print(i);
    }
	}
}

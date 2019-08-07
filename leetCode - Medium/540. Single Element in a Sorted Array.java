class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int i = binarySearch(nums, 0, nums.length);
        return i;
        
    }
    
    
    static int binarySearch(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;

        if (end - start <= 1) {
            return nums[start];
        }
        
        if (( mid-1 >= start && nums[mid] != nums[mid - 1]) && (mid+1 < end && nums[mid] != nums[mid + 1] ) )
            return nums[mid];
        
        if (mid-1 >= 0 && nums[mid] != nums[mid - 1] ) {
            mid = mid -1;  
        }

        if ((mid -start +1) % 2 != 0) { // this part 
            return binarySearch(nums, start, mid + 1);
        } else {
            return binarySearch(nums, mid + 1, end);            
        }        
    }
}
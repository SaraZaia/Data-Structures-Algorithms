class Solution {
    public int singleNumber(int[] nums) {
        int end = nums.length;
        Arrays.sort(nums); 
        System.out.println(Arrays.toString(nums));

        
        if (nums == null) return 0;
        if (nums.length <= 2) return nums[0];
        if (nums[end-1] != nums[end-2]) return nums[end-1];

        for (int i = 0; i < nums.length-1; i = i + 3) {
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        
        return 0;
    }
}
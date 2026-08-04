class Solution {
    public boolean hasDuplicate(int[] nums) {
    
        for (int i=0 ; i < nums.length-1; i++){
             Arrays.sort(nums);
            int count = 0;
            if(nums[i] == nums[i+1]){
                count++;
            }
            if(count>=1){
                return true;
            }
        }
        return false;
    }
}
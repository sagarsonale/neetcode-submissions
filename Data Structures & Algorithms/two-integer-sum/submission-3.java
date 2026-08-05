class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        int v1 = 0;
        int v2 = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                 return new int[] {i,j};
                }
                 
            }
        }
    return new int[] {};
    }
}

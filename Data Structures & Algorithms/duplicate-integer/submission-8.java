class Solution {
    public boolean hasDuplicate(int[] nums) {
       // Set<Integer> set = new HashSet<>();

Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        if(set.size()== nums.length){
            return false;
        }
        return true;
    }
}
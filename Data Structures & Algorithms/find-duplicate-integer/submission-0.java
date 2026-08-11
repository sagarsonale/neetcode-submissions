class Solution {
    public int findDuplicate(int[] nums) {
      HashMap<Integer,Integer> dup = new HashMap<>();
      for(int i : nums){
        dup.put(i, dup.getOrDefault(i, 0) + 1);
      }
      for(Map.Entry<Integer, Integer> entry : dup.entrySet()){
        if(entry.getValue() > 1){
            return entry.getKey();
        }
      }
      return 0;
    }
}

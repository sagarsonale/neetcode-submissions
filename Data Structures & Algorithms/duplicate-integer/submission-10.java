class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> ma = new HashMap<>();
        for(int num : nums){
            ma.put(num, ma.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : ma.entrySet()){
            int freq = entry.getValue();
            if(freq > 1){
                return true;
            }
        }
        return false;
    }
}
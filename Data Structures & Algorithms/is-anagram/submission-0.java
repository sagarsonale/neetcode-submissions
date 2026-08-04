class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else {
           Map<Character,Integer> ch1 = new HashMap<>();
            Map<Character, Integer>ch2 = new HashMap<>();
            for(char chr : s.toCharArray()){
                ch1.put(chr,ch1.getOrDefault(chr,0)+1);
            }
            for(char chr1 : t.toCharArray()){
                ch2.put(chr1,ch2.getOrDefault(chr1,0)+1);
            }

            if(ch1.equals(ch2)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

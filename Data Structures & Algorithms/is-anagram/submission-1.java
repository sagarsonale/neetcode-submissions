class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
            HashMap<Character, Integer> fs = new HashMap<>();
            HashMap<Character, Integer> ft = new HashMap<>();
        if(s1 != t1){
            return false;
        }else {
        
            for(char ch : s.toCharArray()){
                fs.put(ch, fs.getOrDefault(ch,0) + 1);
            }
            for(char ch : t.toCharArray()){
                ft.put(ch, ft.getOrDefault(ch,0) +1);
            }

          boolean isEqual = fs.equals(ft); 
            return isEqual;
        }
         
    }
}

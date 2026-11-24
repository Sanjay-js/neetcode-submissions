class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> s1 =  new HashMap<>();
        HashMap<Character, Integer> t1 =  new HashMap<>();

        for (char ana1 : s.toCharArray()){
            
            s1.put(ana1, s1.getOrDefault(ana1, 0)+1 );
        }

        for (char ana2 : t.toCharArray()){
            
            t1.put(ana2, t1.getOrDefault(ana2, 0)+1 );
        }
        return s1.equals(t1);
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


HashMap<String, List<String>> map = new HashMap<>();

        if (strs.length == 0 ){
            return null;
        }

        for ( int i = 0 ; i < strs.length ; i++ ){
            String word = strs[i];
            char[]  letters= word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
            }
            return new ArrayList<>(map.values());

    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();



        for (int i=0; i < nums.length;i++){

            int count = map.getOrDefault(nums[i], 0);

            map.put(nums[i], count + 1);

        }

        List<Integer> keyList = new ArrayList<>(map.keySet());

        keyList.sort((a,b) -> Integer.compare(map.get(b),map.get(a)));

        int[] res = new int[k];
        for (int i=0; i<k ; i++){
            res[i] = keyList.get(i);
        }

return res;
    }
}

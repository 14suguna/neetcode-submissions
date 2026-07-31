class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(
                nums[i],
                hm.getOrDefault(nums[i], 0) + 1
            );
        }

        // Store the keys in a list
        List<Integer> keylist = new ArrayList<>();
        keylist.addAll(hm.keySet());

        // Move the top k frequent keys to the first k positions
        for (int i = 0; i < k; i++) {

            int highestIndex = i;

            for (int j = i + 1; j < keylist.size(); j++) {
                int currentKey = keylist.get(j);
                int highestKey = keylist.get(highestIndex);

                if (hm.get(currentKey) > hm.get(highestKey)) {
                    highestIndex = j;
                }
            }

            // Swap only after finding the highest frequency
            int temp = keylist.get(i);
            keylist.set(i, keylist.get(highestIndex));
            keylist.set(highestIndex, temp);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keylist.get(i);
        }

        return result;
        

    }
}

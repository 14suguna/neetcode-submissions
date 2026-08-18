class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(hmap.containsKey(diff)){
                int[] result =  new int[] {hmap.get(diff),i};
                return result;
            }else
            {
                hmap.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}

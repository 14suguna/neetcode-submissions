class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(!hset.add(nums[i])){
                return true;
            }
        }
        return false;
        
    }
}
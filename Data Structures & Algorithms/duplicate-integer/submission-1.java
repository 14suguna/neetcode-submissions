class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for(int i=0; i< nums.length;i++){
            if(!hSet.add(nums[i])){
                return true;
            }
        }
        return false;
        
    }
}
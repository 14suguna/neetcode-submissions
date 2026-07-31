class Solution {
    public int search(int[] nums, int target) {

        Map<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target)){
                return hm.get(target);
            }else if(target == nums[i]){
            hm.put(nums[i],i);
            return hm.get(target);
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return -1;
    }
}

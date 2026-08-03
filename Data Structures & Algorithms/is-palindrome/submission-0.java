class Solution {
    public boolean isPalindrome(String s) {

        // Was it a car or a cat I saw?
        //wasitacaroracatisaw
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left =0;
        int right = cleaned.length()-1;

        while(left < right){
            if(cleaned.charAt(left) == cleaned.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}

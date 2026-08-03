class Solution {
    public boolean isPalindrome(String s) {

        // Was it a car or a cat I saw?
        //wasitacaroracatisaw
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left =0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}

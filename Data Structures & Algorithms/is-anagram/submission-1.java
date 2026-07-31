class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Map<Character,Integer> hm = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0; i<sChar.length;i++){
            hm.put(sChar[i], hm.getOrDefault(sChar[i], 0) + 1);
            hm.put(tChar[i], hm.getOrDefault(tChar[i], 0) - 1);
        }

        for (int val : hm.values()) {
            if (val != 0) {
                return false;
            }

        }
        return true;
    }
}

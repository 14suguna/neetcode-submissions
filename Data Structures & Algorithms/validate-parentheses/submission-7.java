class Solution {
    public boolean isValid(String s) {
        Stack<Character> charc = new Stack<>();

       // s="[(])"

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)== '{' || s.charAt(i)=='[' || s.charAt(i)=='(')
            {
                charc.push(s.charAt(i));
            }else if(charc.isEmpty()){
                    return false;
                }
            // else if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')')
            else if((s.charAt(i)=='}' && charc.peek() == '{') ||(s.charAt(i)==')' && charc.peek() == '(') ||(s.charAt(i)==']' && charc.peek() == '[') ){
                charc.pop();
                }
            else{
                return false;
            }
        }
        if(!charc.isEmpty()){
                    return false;
                }

            return true;
    }
}

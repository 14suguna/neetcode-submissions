class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

         //temperatures = [30,38,30,36,35,40,28]
        int[] result = new int [temperatures.length];
        for(int i =0; i<temperatures.length; i++)
        {
            int j =i+1;
            while(j<temperatures.length){
            if(temperatures[i]<temperatures[j]){
                result[i] = j-i;
                break;
            }
            j++;
            }
        }
    return result;
        
    }
}

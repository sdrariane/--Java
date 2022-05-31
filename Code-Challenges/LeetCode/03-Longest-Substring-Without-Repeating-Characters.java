public class Solution {
 public int lengthOfLongestSubstring(String s) {
     
     //At first we analize the length os the string
     //then we put that length in a variable
     int n = s.length();
     
     //Then we set a parameter variable
     int res = 0;
     
     //The loop in work according to the variable n
     for(int i = 0; i < n; i++){
         
         //In a second loop where for each loop we'll
         //check for repetitions (nother method that'll
         //create)
         for(int j = i; j < n; j++){
             
             //Note that the method will analyze each
             //parameter valuable we set during the
             //development 
             if(checkRepetition(s, i, j)){
                 
                 res = Math.max(res, j - i + 1);
                 
             }
             
         }
         
     }
     
     return res;
 }
 
 private boolean checkRepetition(String s, int start, int end){
     
     //Here we established a limit
     int[] chars = new int[128];
     
     for(int i = start; i <= end; i++){
         
         //Method returns a char value at the given
         //index number
         char c = s.charAt(i);
         
         //There we add th number of different letters that'll
         //impact in their length
         chars[c]++;
         
         //That'll return false if it's repeated
         if(chars[c] > 1){ return false; }
     }
     
 }
 
 return true;
 
}

class Solution {
 public int[] twoSum(int[] nums, int target) {
     
     //Given the variables we just analyzed,
     //we set the number of loops according 
     //to the length of the array - limited 
     //to the amount of data assigned to it
     for(int i=0; i < nums.length; i++){
         
         //Given the target, we'll seek through the
         // array length for another one which is
         //equal to the target minus that element
         for(int j = i + 1; j < nums.length; j++){
             
             //The return array - that one about
             //the number's position
             if(nums[j] == target - nums[i]){
                 return new int[] {i, j};
             }
             
         }
         
     }
     return null;
 }
}
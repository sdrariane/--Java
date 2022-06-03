public class 45ConstruirPalindromo {
 
 String solution(String st) {
  int len = st.length();
  int pos = 0;
  if(len == 1) return st;
  String newString = st;
  boolean palindrome_flag = isPalindrome(st);
  while(!palindrome_flag){
   newString = createNewString(st, pos);
   palindrome_flag = isPalindrome(newString);
   pos++;
  }
  return newString;
 }

 String createNewString(String st, int pos){
  String ending = st.substring(0, pos);
  StringBuilder reverse = new StringBuilder(ending).reverse();
  ending = reverse.toString();
  st = st + ending;
  return st;
 }

 boolean isPalindrome(String st){
  int len = st.length();
  int l = 0;
  int r = len - 1;
  while(l <= r){
   if(st.charAt(l) != st.charAt(r)) return false;
   l++;
   r--;
  }
  return true;
 }

}

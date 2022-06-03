public class 44EncontrarDomnioEmail {
 
 String solution(String address) {
  int ind = address.lastIndexOf("@");
  return address.substring(ind + 1);
 }
 
}
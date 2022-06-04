public class 58MensagemDeCodigoBinario {
 String solution(String code) {
  StringBuilder message = new StringBuilder();

  for(int ind = 0; ind < code.length(); ind = ind + 8){
   char ch = (char) Integer.parseInt(code.substring(ind, ind + 8), 2);
   message.append(ch);
  }

  return message.toString();
 }
}
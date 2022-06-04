public class 52MaiorPalavra {
 String solution(String text) {
  text = text.replaceAll("[^a-zA-Z]+", " ");
  String[] words = text.split(" ");
  String max = words[0];
  for(String word : words){
   if(word.length() > max.length()){ max = word; }
  }
  return max;
 }
}
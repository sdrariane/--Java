public class 43StringBonita {
 boolean solution(String inputString) {
  HashMap<Character, Integer> tracker = getCounter(inputString);
  int alphaFirst = (int) 'a';
  int alphaLast = (int) 'z';
  int prev = Integer.MAX_VALUE;
  for(int let = alphaFirst; let <= alphaLast; let++){
   int count;
   if(tracker.containsKey((char) let)){
    count = tracker.get((char) let);
   } else {
    count = 0;
   }
   if(count > prev) return false;
   prev = count;
  }
  return true;
}

HashMap<Character, Integer> getCounter(String inputString){
 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 int len = inputString.length();
 for(int ind = 0; ind < len; ind++){
  char let = inputString.charAt(ind);
  if(map.containsKey(let)){ map.put(let, map.get(let) + 1); }
  else { map.put(let, 1); }
 }
 return map;
}
}

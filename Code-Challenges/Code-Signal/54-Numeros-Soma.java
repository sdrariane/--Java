public class 54NumerosSoma {
 int solution(String inputString) {
  int sum = 0;
  Pattern p = Pattern.compile("\\d+");
  Matcher m = p.matcher(inputString);
  while(m.find()){
   int num = Integer.parseInt(m.group());
   sum += num;
  }
  return sum;
 }
}
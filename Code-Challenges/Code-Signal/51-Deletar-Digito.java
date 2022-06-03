public class 51DeletarDigito {
 int solution(int n) {
  int max = 0;
  for(int num = 1; num < n; num *= 10){
   max = Math.max(n / 10 / num * num + n % num, max);
  }
  return max;
 }
}

public class 56DigitosDeProdutos {
 int solution(int product) {

  if(product == 0) return 10;
  else if (product < 10) return product;

  int smallPos = 0;

  while(product > 9){
   int orig = product;
   for(int f = 9; f > 1; f--){
    if(product % f == 0){
     int nextDigit = product / f;
     nextDigit = solution(nextDigit);
     if(nextDigit == -1) return -1;
     smallPos = smallPos * 10 + nextDigit;
     product = f;
     break;
    }
   }

   if(product == orig) return -1;
  }
  return smallPos * 10 + product;
 }
}
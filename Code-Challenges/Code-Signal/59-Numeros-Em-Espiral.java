public class 59-Numeros-Em-Espiral {
 int[][] solution(int n) {
  int[][] spiral = new int[n][n];

  int walk = 1;

  int r0 = 0;
  int c0 = 0;

  int rL = n;
  int cL = n;

  while(r0 < rL && c0 < cL){

   for(int x = c0; x < cL; x++){
    spiral[r0][x] = walk;
    walk++;
   }

   r0++;

   for(int y = r0; y < rL; y++){
    spiral[y][cL - 1] = walk;
    walk++;
   }

   cL--;
   
   for(int x = cL - 1; x >= c0; x--){
    spiral[rL - 1][x] = walk;
    walk++;
   }

   rL--;

   for(int y = rL - 1; y >= r0; y--){
    spiral[y][c0] = walk;
    walk++;
   }

   c0++;
  }
  return spiral;
 }
}
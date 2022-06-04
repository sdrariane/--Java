public class 55QuadradosDiferentes {
 int solution(int[][] matrix) {
  Set<String> squareTracker = new HashSet<String>();
  int ht = matrix.length;
  int wd = matrix[0].length;

  for(int u_to_d = 0; u_to_d < ht - 1; u_to_d++){
   for(int l_to_d = 0; l_to_d < wd - 1; l_to_d++){
    squareTracker.add(get2x2Window(matrix, l_to_d, u_to_d));
   }
  }
  return squareTracker.size();
 }

 String get2x2Window(int[][] matrix, int xPos, int yPos){
  return encode(matrix[yPos][xPos], matrix[yPos + 1][xPos], matrix[yPos][xPos + 1], matrix[yPos + 1][xPos + 1]);
 }

 String encode(int tl, int tr, int bl, int br){
  return tl + "" + tr + "" + bl + "" + br;
 }
}
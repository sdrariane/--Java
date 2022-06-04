public class 60Sudoku {
 boolean solution(int[][] grid) {
  for(int j = 0; j < grid.length; j = j + 3){
   for(int i = 0; i < grid[0].length; i = i + 3){
    if(!check3x3(grid, i, j)) return false;
   }
  }

  if(!checkSet(grid)) return false;

  for(int j = 0; j < grid.length; j++){ if(!checkRow(grid, j)) return false; }

  for(int i = 0; i < grid[0].length; i++){ if(!checkCol(grid, i)) return false; }

  return true;
 }

 boolean checkSet(int[][] grid){
  for(int i = 0; i < 9; i++){
   Set<Integer> xSet = new HashSet<Integer>();
   Set<Integer> ySet = new HashSet<Integer>();

   for(int j = 0; j < 9; j++){
    xSet.add(grid[i][j]);
    ySet.add(grid[j][i]);
   }

   if(xSet.size() != 9) return false;
   if(ySet.size() != 9) return false;
  }
  return true;
 }

 boolean checkRow(int[][] grid, int c){
  int sum = grid[c][0] + grid[c][1] + grid[c][2] + grid[c][3] + grid[c][4] + grid[c][5] + grid[c][6] + grid[c][7] + grid[c][8];
  return sum == 45;
 }

 boolean checkCol(int[][] grid, int r){
  int sum = grid[0][r] + grid[1][r] + grid[2][r] + grid[3][r] + grid[4][r] + grid[5][r] + grid[6][r] + grid[7][r] + grid[8][r];
  return sum == 45;
 }

 boolean check3x3(int[][] grid, int i, int j){
  int sum = grid[i][j] + grid[i+1][j] + grid[i+2][j] + grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1] + grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
  return sum == 45;
 }
}
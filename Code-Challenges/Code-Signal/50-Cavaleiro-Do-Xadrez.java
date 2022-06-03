public class 50CavaleiroDoXadrez {
 int solution(String cell) {
  return findPossible(cell.charAt(0), cell.charAt(1));
 }

 int findPossible(char horz, char vert){
  int moves = 0;
  if(horz - 2 >= 'a' && vert + 1 <= '8') moves++;
  if(horz - 1 >= 'a' && vert + 2 <= '8') moves++;
  if(horz - 1 >= 'a' && vert - 2 >= '1') moves++;
  if(horz - 2 >= 'a' && vert - 1 >= '1') moves++;

  if(horz + 2 <= 'h' && vert + 1 <= '8') moves++;
  if(horz + 1 <= 'h' && vert + 2 <= '8') moves++;
  if(horz + 1 <= 'h' && vert - 2 >= '1') moves++;
  if(horz + 2 <= 'h' && vert - 1 >= '1') moves++;

  return moves;
 }
}
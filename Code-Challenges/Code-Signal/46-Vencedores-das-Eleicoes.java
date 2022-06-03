public class 46VencedoresDasEleicoes {

 int solution(int[] votes, int k) {
  int maxPos = -1;
  int max = Integer.MIN_VALUE;
  int winners = 0;
  int numCandidates = votes.length;
  for(int pos = 0; pos < numCandidates; pos++){
   if(votes[pos] > max){
    maxPos = pos;
    max = votes[pos];
    winners = 1;
   } else if(votes[pos] == max) {
    winners++;
   }
  }

  if(k == 0 && winners > 1) return 0;
  winners = 1;

  for(int pos = 0; pos < numCandidates; pos++){
   if(maxPos == pos) continue;
   if(votes[pos] + k > max){ winners++; }
  }
  return winners;
 }

}
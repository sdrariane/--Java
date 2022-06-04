public class 57NomeacaoDeArquivos {
 String[] solution(String[] names) {
  Map<String, Integer> tally = new HashMap<String, Integer>();

  for(int ind = 0; ind < names.length; ind++){
   String name = names[ind];
   int numFiles = tally.getOrDefault(name, 0);
   numFiles = nextNumFiles(tally, name, numFiles);

   if(tally.containsKey(name)){
    names = updateNames(names, ind, numFiles - 1);
    tally.put(names[ind], 1);
   }

   tally.put(name, numFiles);
  }

  return names;
 }

 int nextNumFiles(Map<String, Integer> tally, String name, int numFiles){
  do{ numFiles++; } while (tally.containsKey(name + "(" + (numFiles - 1) + ")"));
  return numFiles;
 }

 String[] updateNames(String[] names, int ind, int num){
  String name = names[ind];
  names[ind] = name + "(" + num + ")";
  return names;
 }
}
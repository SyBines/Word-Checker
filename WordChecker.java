import java.util.ArrayList;

public class WordChecker {
    public WordChecker(ArrayList<String> wordList){
        this.wordList = wordList;
    }

    private ArrayList<String> wordList;

    public boolean isWordChain() {
        String prevWord = "";
for (String word: wordList){
    if (word.contains(prevWord));
    prevWord = word;
}
return true;
    }

    public ArrayList<String> createList(String target) {
        return null;
    }
}
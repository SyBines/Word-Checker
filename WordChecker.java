import java.util.ArrayList;

public class WordChecker {
    public WordChecker(ArrayList<String> wordList){
        this.wordList = wordList;
    }

    private ArrayList<String> wordList;

    public boolean isWordChain() {
        String prevWord = "";
for (String word: wordList){
    if (word.contains(prevWord)) {
        prevWord = word;
    }
    else {
        return false;
    }

}
return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> newList = new ArrayList<>();
        for (String word: wordList){
            if (word.startsWith(target)){
                newList.add(word.substring(target.length()));

            }

        }

        return newList;
    }
}
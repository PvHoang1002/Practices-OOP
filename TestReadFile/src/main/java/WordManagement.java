import java.util.ArrayList;

public class WordManagement {
    private ArrayList<Word> words;

    public WordManagement() {

    }

    public WordManagement(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Word> getWords() {
        return this.words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    public void addWord(Word newWord) {
        words.add(newWord);
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < words.size(); i++) {
            str += words.get(i).toString() + "\n\n";
        }
        return str;
    }
}

import java.util.ArrayList;

public class Word {
    private String word;
    private String wordSpelling;
    private String wordKind;
    private ArrayList<String> wordMeanings;

    public Word() {

    }

    public Word(String word, String wordSpelling, String wordKind, ArrayList<String> wordMeanings) {
        this.word = word;
        this.wordSpelling = wordSpelling;
        this.wordKind = wordKind;
        this.wordMeanings = wordMeanings;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordSpelling() {
        return this.wordSpelling;
    }

    public void setWordSpelling(String wordSpelling) {
        this.wordSpelling = wordSpelling;
    }

    public String getWordKind() {
        return this.wordKind;
    }

    public void setWordKind(String wordKind) {
        this.wordKind = wordKind;
    }

    public ArrayList<String> getWordMeanings() {
        return this.wordMeanings;
    }

    public void setWordMeanings(ArrayList<String> wordMeanings) {
        this.wordMeanings = wordMeanings;
    }

    public void addWord(String newWordMeaning) {
        wordMeanings.add(newWordMeaning);
    }

    public String toString() {
        String str =  word + " " + wordSpelling + "\n" + wordKind + "\n";
        for (int i = 0; i < wordMeanings.size(); i++) {
            str += wordMeanings.get(i) +  "\n";
        }
        return str;
    }
}

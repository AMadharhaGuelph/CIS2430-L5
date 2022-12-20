import java.util.Arrays;
import java.util.HashMap;

/**
 * This class has a word list that is used to store the words. It provides some functionality such as to add
 * a word to the list, count a number of time a word that is in the list, and remove all
 * words in the list.
 */
public class WordCount {

    //HashMap collection to store words
    private HashMap<String, Integer> wordList;

    /**
     * This constructor initializes the wordList 
     */
    public WordCount() {
        wordList = new HashMap<String, Integer>();
    }

    /**
     * This constructor initializes the word list to the words in the string,
     * separated by spaces.if String words is null or empty, initialize wordList
     * to be empty HashMap.
     * @param words String of words
     */
    public WordCount(String words) {
        try {
            words.equals(null);
        } catch(NullPointerException npe) {
            wordList = new HashMap<String, Integer>();
            return;
        }

        String[] wordsArr = words.split("\\s");
        wordList = new HashMap<String, Integer>();

        if(wordsArr.length != 0) {
            for(int i = 0; i < wordsArr.length; i++) {
                addWord(wordsArr[i]);
            }
        }
    }

    /**
     * This method adds a word to the list of words stored by the object. If
     * String toAdd is null or empty, do not add to the word list. 
     * @param toAdd
     */
    public void addWord(String toAdd) {
        try {
            toAdd.equals(null);
        } catch(NullPointerException npe) {
            return;
        }

        if(toAdd.isBlank()) {
            return;
        }
        
        for (String key : wordList.keySet()) {
            if(key.equals(toAdd)) {
                wordList.put(toAdd, wordList.get(toAdd) + 1);
                return;
            }
        }

        wordList.put(toAdd, 1);
        
    }

    /**
     * This method removes all words from the list of words stored by the object
     */
    public void startOver() {
        wordList.clear();
    }

    /**
     * This method returns an integer representing the number of times that a word is
     * in the list of words stored by the object. If the String word is null or
     * empty return 0
     * @param the word to be checked for number of time that in the list of words
     * @return the number of times a word is in the list
     */
    public int countWord(String word) {
        try {
            word.equals(null);
        } catch(NullPointerException npe) {
            return 0;
        }

        if(wordList.get(word) == null) {
            return 0;
        }

        return wordList.get(word);
    }

    public void output() {
        System.out.println(Arrays.asList(wordList));
    }
}
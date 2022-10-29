import java.util.HashMap;

public class Scrabble {
    private String word;
    private int score;
    private final char[] oneScoreLetters = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'};
    private final char[] twoScoreLetters = {'d', 'g'};
    private final char[] threeScoreLetters = {'b', 'c', 'm', 'p'};
    private final char[] fourScoreLetters = {'f', 'h', 'v', 'm', 'y'};
    private final char[] fiveScoreLetters = {'k'};
    private final char[] eightScoreLetters = {'j', 'x'};
    private final char[] tenScoreLetters = {'q', 'z'};
    private HashMap<Character, Integer> letterScores = new HashMap<>();

    public Scrabble(String word) {
        if (word == null) {
            this.word = " ";
        } else {
            this.word = word.toLowerCase();
            calculateLetterScores();
        }
    }

    public int score() {
        for(int i = 0; i < this.word.length(); i++) {
            for(HashMap.Entry<Character, Integer> entry : letterScores.entrySet()) {
                if(this.word.charAt(i) == entry.getKey()) {
                    score += entry.getValue();
                }
            }
        }
        return score;
    }

    private void calculateLetterScores() {
        for (char c : oneScoreLetters) {
            letterScores.put(c, 1);
        }
        for (char c : twoScoreLetters) {
            letterScores.put(c, 2);
        }
        for (char c : threeScoreLetters) {
            letterScores.put(c, 3);
        }
        for (char c : fourScoreLetters) {
            letterScores.put(c, 4);
        }
        for (char c : fiveScoreLetters) {
            letterScores.put(c, 5);
        }
        for (char c : eightScoreLetters) {
            letterScores.put(c, 8);
        }
        for (char c : tenScoreLetters) {
            letterScores.put(c, 10);
        }
    }
}





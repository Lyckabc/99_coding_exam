package programmers.CT_basic.day09.P120838;
/**
 * Class: P120838
 *
 * @author lyckabc
 * @date 2024-07-16 15:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.HashMap;
public class P120838 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String letter = ".... . .-.. .-.. ---";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(letter));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    private String[] morse = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    public String solution(String letter) {
        String answer = "";
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char) (i + 'a'));
        }
        String[] letters = letter.split(" ");
        for (int i = 0; i < letters.length; i++) {
            answer += map.get(letters[i]);
        }
        return answer;
    }
}

/*
 class Solution {
    private HashMap<String, String> morse = new HashMap<>();
    { 
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
    };
    public String solution(String letter) {
        String answer = "";
        String[] letters = letter.split(" ");
        for (int i = 0; i < letters.length; i++) {
            answer += morse.get(letters[i]);
        }
        return answer;
    }
}
 */
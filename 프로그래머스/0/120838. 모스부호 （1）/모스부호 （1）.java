import java.util.HashMap;
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
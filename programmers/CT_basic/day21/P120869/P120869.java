package programmers.CT_basic.day21.P120869;
/**
 * Class: P120869
 *
 * @author lyckabc
 * @date 2024-08-09 09:30
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120869 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(spell, dic));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cntSpell = 0;
        int lenSpell = spell.length;
        for (int i = 0; i < dic.length; i++) {
            String tmpStr = dic[i];
            for (int j = 0; j < lenSpell; j++) {
                if (tmpStr.contains(spell[j])) cntSpell++;
                tmpStr = tmpStr.replaceFirst(spell[j], "");
            }
            if (tmpStr.isEmpty() && cntSpell == lenSpell) return 1;
            cntSpell = 0;
        }
        return answer;
    }
}
/*
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic)
        .map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining()))
        .collect(Collectors.toList())
        .contains(Arrays.stream(spell)
        .sorted()
        .collect(Collectors.joining())) ? 1 : 2;
    }
}
 */
/*
class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i=0;i<dic.length;i++){
            int answer = 0;
            for(int j=0;j<spell.length;j++){
                if(dic[i].contains(spell[j])) answer ++;
            }
            if(answer==spell.length) return 1;
        }
        return 2;
    }
}

 */
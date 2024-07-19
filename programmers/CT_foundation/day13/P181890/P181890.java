package day13.P181890;
/**
 * Class: P181890
 *
 * @author lyckabc
 * @date 2024-07-19 17:55
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181890 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] str_list = {"u", "u", "l", "r"};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(str_list)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, i);
                break;
            } else if (str_list[i].equals("r")) {
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                break;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        int temp = 0;
        boolean isright = false;
        boolean isleft = false;
        for(int i=0; i<str_list.length; i++){

            if(str_list[i].equals("l")){
                temp= i;
                isleft = true;
                break;
            }else if(str_list[i].equals("r")){
                temp=i;
                isright = true;
                break;
            }
        }

        if(isleft){
            answer = new String[temp];

            for(int i=0; i<temp;i++){
                answer[i] = str_list[i];
            }
        }else if(isright){
            answer = new String[str_list.length-temp-1];

            for(int i=temp+1; i<str_list.length; i++){
                answer[i-temp-1] = str_list[i];
            }
        }
        return answer;
    }
}
 */
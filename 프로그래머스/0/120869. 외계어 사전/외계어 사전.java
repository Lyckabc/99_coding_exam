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
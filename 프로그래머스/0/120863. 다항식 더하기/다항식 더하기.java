class Solution {
    public String solution(String polynomial) {
        int xNum = 0;
        int num = 0;
        String[] formula = polynomial.split(" ");
        for (String part : formula) {
            if (part.endsWith("x")) {
                if (part.equals("x")) {
                    xNum++;
                } else {
                    xNum += Integer.parseInt(part.replace("x", ""));
                }
            } else if (part.contains("+")) {
                continue;
            }
            else {
                num += Integer.parseInt(part);
            } 
        }
        StringBuilder sb = new StringBuilder();
        if (xNum != 0){
            if (xNum == 1) {
                sb.append("x");
            } else {
                sb.append(xNum).append("x");
            }
        }
        if (num != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(num);
        }

        return sb.length() == 0 ? "0" : sb.toString();    
    }
}
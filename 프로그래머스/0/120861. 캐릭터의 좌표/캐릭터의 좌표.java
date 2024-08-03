class Solution {
    public int[] solution(String[] keyinput, int[] board) {   
        int x = 0;
        int y = 0;
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        for (int i = 0; i < keyinput.length; i++) {
            String tmp = keyinput[i];
            if (tmp.equals("left")) {
                x = Math.max(-maxX, x - 1);
            } else if (tmp.equals("right")) {
                x = Math.min(maxX, x + 1);
            } else if (tmp.equals("down")) {
                y = Math.max(-maxY, y - 1);
            } else if (tmp.equals("up")) {
                y = Math.min(maxY, y + 1);
            }
        }
        return new int[] {x,y};
    }
}
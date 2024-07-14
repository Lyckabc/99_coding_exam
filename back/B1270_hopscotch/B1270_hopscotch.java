/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/23/2024  9:30 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package B1270;
import java.util.*;
import java.io.*;

public class B1270_hopscotch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int soldiersCount = Integer.parseInt(st.nextToken());
            HashMap<Long, Long> armyCounts = new HashMap<>();
            long majorityCount = soldiersCount / 2;
            Long dominantArmy = null;
            boolean isTie = false;
            for (int j = 0; j < soldiersCount; j++) {
                long armyNumber = Long.parseLong(st.nextToken());
                long count = armyCounts.getOrDefault(armyNumber, 0L) + 1;
                armyCounts.put(armyNumber, count);
                if (count > majorityCount) {
                    if (dominantArmy == null || dominantArmy.equals(armyNumber)) {
                        dominantArmy = armyNumber;
                    } else {
                        isTie = true;
                        break;
                    }
                }
            }
            System.out.println(isTie || dominantArmy == null ? "SYJKGW" : dominantArmy);
        }
    }
}

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] diceCounts = new int[7];
        
        diceCounts[a]++;
        diceCounts[b]++;
        diceCounts[c]++;
        diceCounts[d]++;
        
        int tripple = 0;
        List<Integer> doubles = new ArrayList<>();
        List<Integer> singles = new ArrayList<>();
        
        for (int i = 0; i < diceCounts.length; i++) {
            int count = diceCounts[i];
            
            if (count == 4) {
                answer = 1111 * i;
                break;
            } else if (count == 3) {
                tripple = i;
            } else if (count == 2) {
                doubles.add(i);
            } else if (count == 1) {
                singles.add(i);
            }
        }
        
        if (tripple > 0) {
            int s1 = singles.get(0);
            
            answer = (int) Math.pow(10 * tripple + s1, 2);
        } else if (doubles.size() == 2) {
            int d1 = doubles.get(0);
            int d2 = doubles.get(1);
            
            answer = (d1 + d2) * Math.abs(d1 - d2);
        } else if (singles.size() == 2) {
            int s1 = singles.get(0);
            int s2 = singles.get(1);
            
            answer = s1 * s2;
        } else if (singles.size() == 4) {
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }
        
        return answer;
    }
}
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};
        
        int len = score.length;
        answer = new int[len];
        List<Double> scoreAvg = new ArrayList<>();
        
        for (int[] s : score) {
            double avg = (s[0] + s[1]) / 2.0;
            scoreAvg.add(avg);
        }
        
        for (int i = 0; i < len; i++) {
            answer[i] = len;
            double avg = scoreAvg.get(i);
            
            for (int j = 0; j < len; j++) {
                double target = scoreAvg.get(j);
                
                answer[i] = i != j && avg >= target ? answer[i] - 1 : answer[i];
            }
        }
        
        return answer;
    }
}
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        List<List<Integer>> overlaps = new ArrayList<>();
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                int[] main = lines[i];
                int[] sub = lines[j];
                
                int mStart = main[0];
                int mEnd = main[1];
                int sStart = sub[0];
                int sEnd = sub[1];
                
                if ((sStart <= mStart && mStart <= sEnd) 
                    || (mStart <= sStart && sStart <= mEnd)) {
                    int oStart = Math.max(mStart, sStart);
                    int oEnd = Math.min(mEnd, sEnd);
                    
                    if (oStart < oEnd) {
                        overlaps.add(List.of(oStart, oEnd));
                    }
                }
            }
        }
        
        for (int i = 0; i < overlaps.size(); i++) {
            for (int j = i + 1; j < overlaps.size(); j++) {
                List<Integer> main = overlaps.get(i);
                List<Integer> sub = overlaps.get(j);
                
                int mStart = main.get(0);
                int mEnd = main.get(1);
                int sStart = sub.get(0);
                int sEnd = sub.get(1);
                
                if ((sStart <= mStart && mStart <= sEnd) 
                    || (mStart <= sStart && sStart <= mEnd)) {
                    int start = Math.min(mStart, sStart);
                    int end = Math.max(mEnd, sEnd);
                    
                    overlaps.set(i, List.of(0, 0));
                    overlaps.set(j, List.of(start, end));
                }
            }
            
            int oStart = overlaps.get(i).get(0);
            int oEnd = overlaps.get(i).get(1);
            
            answer += oEnd - oStart;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] counts = new int[1000];
        int maxCount = 0;
        
        for (int num : array) {
            counts[num]++;
        }
        
        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            
            if (count != 0) {
                if (count == maxCount) {
                    answer = -1;
                }
                
                if (count > maxCount) {
                    maxCount = count;
                    answer = i;
                }
            }
            
        }
        
        return answer;
    }
}
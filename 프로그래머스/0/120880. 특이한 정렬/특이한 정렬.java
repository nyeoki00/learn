class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
        answer = new int[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i] - n;
        }
        
        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                int absI = Math.abs(answer[i]);
                int absJ = Math.abs(answer[j]);
                
                if (absI > absJ || (absI == absJ && answer[i] < answer[j])) {
                    int temp = answer[i];
                    
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] += n;
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] targets = my_string.split("");
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            double mid = (end - start) / 2.0;
            
            for (int i = 0; i <= mid; i++) {
                String temp = targets[start + i];
                targets[start + i] = targets[end - i];
                targets[end - i] = temp;
            }
        }
        
        answer = String.join("", targets);
        
        return answer;
    }
}
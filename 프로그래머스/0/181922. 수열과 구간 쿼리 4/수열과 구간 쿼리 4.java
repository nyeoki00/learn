class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (i == 0) {
                    arr[i]++;
                    continue;
                }
                
                if (i % k == 0) {
                    arr[i]++;
                }
            }
        }  
        
        answer = arr;
        
        return answer;
    }
}
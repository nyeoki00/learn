class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                    flag = true;
                }
            }
            
            if (!flag) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }
        
        return answer;
    }
}
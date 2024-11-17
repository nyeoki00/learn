class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] counts = new int[31];
        
        for (String str : strArr) {
            counts[str.length()]++;
        }
        
        for (int count : counts) {
            if (count > answer) {
                answer = count;
            }
        }
        
        return answer;
    }
}
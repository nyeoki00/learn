class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String target = num + "";
            
            for (String check : target.split("")) {
                answer = check.equals("7") ? answer + 1 : answer;
            }
        }
        
        return answer;
    }
}
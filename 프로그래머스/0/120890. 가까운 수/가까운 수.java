class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        answer = array[0];
        
        for (int num : array) {
            int targetSub = Math.abs(num - n);
            int nowSub = Math.abs(answer - n);
            
            if (targetSub < nowSub || (targetSub == nowSub && num < answer)) {
                answer = num;
            }
        }
        
        return answer;
    }
}
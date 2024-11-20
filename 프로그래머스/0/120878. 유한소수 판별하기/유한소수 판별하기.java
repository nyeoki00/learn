class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int div = 0;
        int count = 0;
        
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                div = b / i;
                break;
            }
        }
        
        
        for (int i = 2; i <= div; i++) {

            if (div % i == 0) {
                count++;

                if (i % 2 != 0 && i % 5 != 0) {
                    answer = 2;
                    break;
                }
            }

            answer = count > 0 ? 1 : 2;
        }
        
        answer = div == 1 ? 1 : answer;
        
        return answer;
    }
}
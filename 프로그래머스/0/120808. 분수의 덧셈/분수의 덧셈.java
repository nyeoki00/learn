class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        answer = new int[2];
        
        int minMul = Math.max(denom1, denom2);
        
        while (minMul % denom1 != 0 || minMul % denom2 != 0) {
            minMul++;
        }
        
        int mul1 = minMul / denom1;
        int mul2 = minMul / denom2;
        
        answer[0] = mul1 * numer1 + mul2 * numer2;
        answer[1] = minMul;
        
        int maxDiv = Math.max(answer[0], answer[1]);
        
        for (int i = maxDiv; i > 0; i--) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] /= i;
                answer[1] /= i;
            }
        }
        
        return answer;
    }
}
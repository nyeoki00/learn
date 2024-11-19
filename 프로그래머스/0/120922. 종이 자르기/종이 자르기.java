class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        int mTime = M - 1;
        int nTime = N - 1;
        
        answer = mTime + (nTime * M);
        
        return answer;
    }
}
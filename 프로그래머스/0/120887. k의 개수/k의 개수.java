class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String check = k + "";
        
        for (int n = i; n <= j; n++) {
            String target = n + "";
            String[] targets = target.split("");
            
            for (String s : targets) {
                if (s.equals(check)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
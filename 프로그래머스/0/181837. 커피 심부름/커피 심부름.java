class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String coffee : order) {
            if (coffee.contains("americano") || coffee.equals("anything")) {
                answer += 4500;
            } else if (coffee.contains("cafelatte")) {
                answer += 5000;
            }
        }
        
        return answer;
    }
}
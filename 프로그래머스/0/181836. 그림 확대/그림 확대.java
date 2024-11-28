class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        
        answer = new String[picture.length * k];
        
        for (int i = 0; i < picture.length; i++) {
            String pic = picture[i];
            String[] targets = pic.split("");
            StringBuilder result = new StringBuilder();
            
            for (String target : targets) {
                result.append(target.repeat(k));
            }
            
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = result.toString();
            }
        }
        
        return answer;
    }
}
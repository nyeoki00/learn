class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        answer = new int[52];
        
        char[] targets = my_string.toCharArray();
        
        for (char target : targets) {
            if (Character.isUpperCase(target)) {
                answer[target - 'A']++;
            } else if (Character.isLowerCase(target)) {
                answer[target - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String check = s;
        String[] target = s.split("");
        
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if (i != j && target[i].equals(target[j])) {
                    check = check.replaceAll(target[i], "");
                    break;
                }
            }
        }
        
        String[] sortTarget = check.split("");
        Arrays.sort(sortTarget);
        
        for (String str : sortTarget) {
            answer += str;
        }
        
        return answer;
    }
}
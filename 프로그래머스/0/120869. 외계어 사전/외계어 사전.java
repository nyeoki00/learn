import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        answer = 2;
        
        Arrays.sort(spell);
        String spellStr = String.join("", spell);

        for (String d : dic) {
            String[] target = d.split("");
            Arrays.sort(target);
            String targetStr = String.join("", target);

            if (targetStr.equals(spellStr)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
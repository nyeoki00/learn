class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        String targets = String.join("", str_list);

        int idxL = targets.contains("l") ? targets.indexOf("l") : targets.length();
        int idxR = targets.contains("r") ? targets.indexOf("r") : targets.length();
        
        if (idxL != 0 && idxL < idxR) {
            answer = targets.substring(0, idxL).split("");
        } else if (idxR != targets.length() - 1 && idxR < idxL) {
            answer = targets.substring(idxR + 1).split("");
        }
        
        return answer;
    }
}
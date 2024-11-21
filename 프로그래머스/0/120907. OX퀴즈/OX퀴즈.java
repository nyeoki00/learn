class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        
        answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String q = quiz[i];
            
            int eqIdx = q.indexOf("=");
            String cal = q.substring(0, eqIdx).trim();
            String result = q.substring(eqIdx + 1).trim();
            
            String[] cals = cal.split(" ");
            int num1 = Integer.parseInt(cals[0]);
            String symbol = cals[1];
            int num2 = Integer.parseInt(cals[2]);
            int resultNum = Integer.parseInt(result);
            
            if (symbol.equals("+")) {
                answer[i] = num1 + num2 == resultNum ? "O" : "X";
            } else if (symbol.equals("-")) {
                answer[i] = num1 - num2 == resultNum ? "O" : "X";
            }
        }
        
        return answer;
    }
}
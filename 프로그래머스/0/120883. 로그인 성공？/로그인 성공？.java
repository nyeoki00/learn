class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (String[] user : db) {
            String dbId = user[0];
            String dbPw = user[1];
            String inputId = id_pw[0];
            String inputPw = id_pw[1];
            
            if (dbId.equals(inputId)) {
                answer = dbPw.equals(inputPw) ? "login" : "wrong pw";
                break;
            }
        }
        
        answer = answer.isEmpty() ? "fail" : answer;
        
        return answer;
    }
}
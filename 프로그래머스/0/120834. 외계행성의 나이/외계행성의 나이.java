class Solution {
    public String solution(int age) {
        String answer = "";
        String ageConvertor = age + "";
        for (char ch : ageConvertor.toCharArray()) {
            answer += (char) (Character.getNumericValue(ch) + 97);
        }
        return answer;
    }
}
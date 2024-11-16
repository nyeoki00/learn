class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] doit = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++)
        {
            for(int j = 0; j < doit.length; j++)
                babbling[i] = babbling[i].replace(doit[j],"_");
            babbling[i] = babbling[i].replace("_","");
            if(babbling[i] == "")
                answer++;            
        }
        return answer;
    }
}
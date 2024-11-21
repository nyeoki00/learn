import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        List<Integer> numsX = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        
        for (String num : polynomial.split(" [+] ")) {
            if (num.contains("x")) {
                if (num.equals("x")) {
                    numsX.add(1);
                } else {
                    int idx = num.indexOf("x");
                    int n = Integer.parseInt(num.substring(0, idx));

                    numsX.add(n);
                }
                
            } else {
                nums.add(Integer.parseInt(num));
            }
        }
        
        int sumX = numsX.stream().mapToInt(i -> i).sum();
        int sum = nums.stream().mapToInt(i -> i).sum();
        
        if (sumX != 0) {
            answer = sumX == 1 ? "x" : sumX + "x";
            
            if (sum != 0) {
                answer += " + " + sum;
            }
        } else {
            answer = sum != 0 ? sum + "" : answer;
        }
        
        return answer;
    }
}
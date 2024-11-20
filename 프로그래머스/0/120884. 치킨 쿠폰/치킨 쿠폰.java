class Solution {
    public int solution(int chicken) {
        int answer = -1;
        answer = 0;
        int coupon = chicken;
        
        while (chicken > 1) {
            chicken /= 10;
            answer += chicken;
            
            int usedCoupon = chicken * 10;
            int newCoupon = chicken;
            
            coupon = coupon - usedCoupon + newCoupon;
        }
        
        while (coupon >= 10) {
            int bonusChicken = coupon / 10;
            
            answer += bonusChicken;
            coupon = coupon % 10 + bonusChicken;
        }
         
        return answer;
    }
}
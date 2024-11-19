import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = BigInteger.valueOf(0);
        
        BigInteger ballsF = BigInteger.valueOf(1);
        BigInteger shareF = BigInteger.valueOf(1);
        BigInteger calF = BigInteger.valueOf(1);
        
        for (int i = 2; i <= balls; i++) {
            BigInteger bi = BigInteger.valueOf(i);
            
            ballsF = ballsF.multiply(bi);
            
            if (i <= share) {
                shareF = shareF.multiply(bi);
            }
            
            if (i <= balls - share) {
                calF = calF.multiply(bi);
            }
        }

        answer = ballsF.divide(calF.multiply(shareF));
        
        return answer;
    }
}
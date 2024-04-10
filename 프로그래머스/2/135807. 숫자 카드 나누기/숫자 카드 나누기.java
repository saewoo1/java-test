
class Solution {
    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
    
    public boolean isDividable(int[] cards, int gcd) {
		for (int card : cards) {
			if (card % gcd == 0) {
				return true;
			}
		}
		return false;
	}
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0], gcdB = arrayB[0];
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(arrayA[i], gcdA);
            gcdB = gcd(arrayB[i], gcdB);
        }
        		if (!isDividable(arrayB, gcdA)) {
			answer = Math.max(answer, gcdA);
		}
		if (!isDividable(arrayA, gcdB)) {
			answer = Math.max(answer, gcdB);
		}
        return answer;
    }
}
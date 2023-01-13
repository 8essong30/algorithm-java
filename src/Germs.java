// 세균증식

/**
 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 */

// n에 2의 t제곱을 곱하면 됨
public class Germs {
    public int solution(int n, int t) {
        return n * (int)Math.pow(2, t);
    }
}

// 다른 이의 답. pow()안쓰고 품
//class Solution {
//    public int solution(int n, int t) {
//
//        for(int i = 0; i < t; i++) {
//            n *= 2;
//        }
//        return n;
//    }
//}

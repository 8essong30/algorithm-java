// 짝수는 싫어요

/**
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class HateEven {
    public int[] solution(int n) {
        int[] answer = n % 2 == 0 ? new int[n / 2] : new int[n / 2 + 1];
        int k = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[k] = i;
            k++;
        }
        return answer;
    }

}



/**
 *  import java.util.stream.IntStream;
 *
 *  class Solution {
 *     public int[] solution(int n) {
 *         return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
 *     }
 *  }
 */
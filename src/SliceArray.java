// 배열 자르기
/**
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 */

import java.util.Arrays;

public class SliceArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);  // copyOfRange 검색해서 찾음
        return answer;
    }
}


// 다른사람 풀이. 원래 내가 풀려고 했던 방식인데 실패했는 이렇게 푸는 방법이!
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1]; // 여기까진 함

        for (int i = num1; i <= num2; i++) {  // 여기 까지도 생각했는데
            answer[i -num1] = numbers[i]; // 이 생각을 못했네
        }

        return answer;
    }
}

// 숨어있는 숫자의 덧셈

/**
 * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 */
public class HidingNum {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^1-9]", "");
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            sum += Integer.valueOf(String.valueOf(my_string.charAt(i)));
        }
        return sum;
    }
}

// 실패항목
/*
    class Solution {
        public int solution(String my_string) {
            my_string = my_string.replaceAll("[^1-9]", "");
            int num = Integer.valueOf(my_string);
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }
*/
// 런타임에러가 발생했다

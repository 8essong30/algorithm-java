import java.util.ArrayList;
import java.util.List;

// 자릿수 더하기

/**
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 */
public class Digit {
    public static int solution(int n) {
        List<Integer> numbers = new ArrayList<>();
        while (n > 0) {
            numbers.add(n % 10);
            n /= 10;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
/**
 * 좀 더 깔끔하게 list 필요 없음
 *
 * int answer = 0;
 *  while(n>0){
 *      answer+=n%10;
 *      n/=10;
 *  }
 * return answer;
 */

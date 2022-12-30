import java.util.Arrays;

public class MaxValue {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr).filter(i -> i != item).toArray();
    }
    // 이거 중복된 글자도 다 빼버려서 이 문제에 맞지 않는 것. 그래서 정답률 80임.

    // 80정답률
    public static int maxValue(int[] numbers) {
        int max = 0;
        for (int num : numbers) {
            max = num > max ? num : max;
        }
        int[] numbersWithoutMax = removeElement(numbers, max);

        int secondMax = 0;
        for (int num : numbersWithoutMax) {
            secondMax = num > secondMax ? num : secondMax;
        }
        return max * secondMax;
    }

    // 이건 100 정답
    class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);
            return numbers[numbers.length-1]*numbers[numbers.length-2];
        }
    }

    public static void main(String[] args) {
        int ret = maxValue(new int[] {1, 4, 55, 2, 55, 3});
        System.out.println(ret);
        // 55 * 55 가 나와야 되는데 55 * 4가 나오니까 안되는거임
    }
}

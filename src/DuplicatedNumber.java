// 배열 속 중복된 숫자 세기

public class DuplicatedNumber {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int num : array) {
            if (num == n) {
                count += 1;
                // count++;의 방법도 있다
            }
        }
        return count;
    }
}

/**다른사람의 답
 * for(int num: array){
 * answer += num==n? 1:0;
 * }
 * 삼항연산자에서 +=를 쓰는 방법도 있구나 깨달음!
 */
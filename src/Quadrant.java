// 점의 위치 구하기

/**
 * (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
 * 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return
 * 하도록 solution 함수를 완성해주세요.
 */

public class Quadrant {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if ( x > 0 ) {
            answer = y > 0 ? 1 : 4;
        } else {
            answer = y > 0 ? 2 : 3;
        }
        return answer;
    }
}

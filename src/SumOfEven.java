// 정수 n 이하 짝수의 합 구하기

public class SumOfEven {
    public int solution(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i+=2){
            sum += i;
        } return sum;
    }
}

// i++만 쓰다가 두개 씩 증가되는 방법이 없을까 하다가 i+2를 썼는데 i+=2였닿

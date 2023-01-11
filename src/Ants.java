// 개미군단
/**
 * 개미 군단이 사냥을 나가려고 합니다.
 * 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
 * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
 * 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
 */
public class Ants {
    public int solution(int hp) {
        return  hp / 5 + (hp % 5 ) / 3 + (hp % 5 % 3 );
    }
}

// 다른 이
/**
 * public int solution(int hp) {
 *         int answer = hp / 5;
 *         hp %= 5;
 *
 *         answer += hp / 3;
 *         hp %= 3;
 *
 *         answer += hp / 1;
 *
 *         return answer;
 *  }
 */
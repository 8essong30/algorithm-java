// 대문자와 소문자

/**
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class UpperAndLowerCase {
    public static String solution(String my_string) {
        String answer = "";
        char[] str = my_string.toCharArray();
        for(char ch : str) {
            answer += Character.isLowerCase(ch) ?
                    Character.toUpperCase(ch) : Character.toLowerCase(ch);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(UpperAndLowerCase.solution("aKAdd"));
        System.out.println(UpperAndLowerCase.solution("abCdEfghIJ"));
    }
}

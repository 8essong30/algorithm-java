// 머쓱이보다 키 큰 사람

public class TallerThan {
    public int solution(int[] array, int height) {
        int count = 0;
        for (int others : array){
            count += (others>height) ? 1 : 0;  // 중복된 숫자에서 본거 바로 써먹기!
        }return count;
    }
}

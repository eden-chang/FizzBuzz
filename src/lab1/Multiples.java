package lab1;

public class Multiples {

    /**
     * n보다 작은 수 중에서 a나 b의 배수인 수들의 개수를 반환
     */
    public static int multiples(int n, int a, int b) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }

        return count;
    }
}
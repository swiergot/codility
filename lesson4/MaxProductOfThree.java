import java.util.Arrays;

public class MaxProductOfThree
{
    public int solution(int[] A)
    {
        Arrays.sort(A);
        int left = A[0] * A[1] * A[A.length - 1];
        int right = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        return Math.max(left, right);
    }
}

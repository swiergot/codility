import java.util.Arrays;

public class Triangle
{
    public int solution(int[] A)
    {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++)
        {
            long p = A[i];
            long q = A[i + 1];
            long r = A[i + 2];

            if (p + q <= r)
            {
                continue;
            }
            if (q + r <= p)
            {
                continue;
            }
            if (r + p <= q)
            {
                continue;
            }

            return 1;
        }

        return 0;
    }
}

public class MissingInteger
{
    public int solution(int[] A)
    {
        final int maxN = 100000;
        boolean[] B = new boolean[maxN];

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > 0 && A[i] <= maxN)
            {
                B[A[i] - 1] = true;
            }
        }

        for (int i = 0; i < B.length; i++)
        {
            if (!B[i])
            {
                return i + 1;
            }
        }

        return maxN + 1;
    }
}

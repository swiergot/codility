public class PermCheck
{
    public int solution(int[] A)
    {
        int s = 0;
        int e = 0;
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] - 1 >= B.length || B[A[i] - 1] == 1)
            {
                return 0;
            }

            B[A[i] - 1] = 1;
            s += A[i];
            e += i + 1;
        }

        if (s == e)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

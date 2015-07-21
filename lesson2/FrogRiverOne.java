class FrogRiverOne
{
    public int solution(int X, int[] A)
    {
        int[] B = new int[X];
        int n = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (B[A[i] - 1] == 0)
            {
                B[A[i] - 1] = 1;

                if (++n == X)
                {
                    return i;
                }
            }
        }

        return -1;
    }
}
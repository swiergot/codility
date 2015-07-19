class TapeEquilibrium
{
    public int solution(int[] A)
    {
        int min = -1;
        int s1 = 0, s2 = 0;

        for (int i = 1; i < A.length; i++)
        {
            if (i == 1)
            {
                s1 = A[0];
                s2 = sum(A, i, A.length - 1);
            }
            else
            {
                s1 += A[i - 1];
                s2 -= A[i - 1];
            }

            int d = Math.abs(s1 - s2);

            if (min == -1 || d < min)
            {
                min = d;
            }
        }

        return min;
    }

    private int sum(int[] A, int first, int last)
    {
        int s = 0;

        for (int i = first; i <= last; i++)
        {
            s += A[i];
        }

        return s;
    }
}
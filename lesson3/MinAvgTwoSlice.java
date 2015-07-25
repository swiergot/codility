public class MinAvgTwoSlice
{
    public int solution(int[] A)
    {
        int min = -1;
        double avg = 0;

        for (int i = 0; i < A.length - 1; i++)
        {
            double a = (1.0 * A[i] + A[i + 1]) / 2;

            if (min == -1)
            {
                min = 0;
                avg = a;
            }
            else if (a < avg)
            {
                min = i;
                avg = a;
            }
            if (i < A.length - 2)
            {
                a = (1.0 * A[i] + A[i + 1] + A[i + 2]) / 3;

                if (a < avg)
                {
                    min = i;
                    avg = a;
                }
            }
        }

        return min;
    }
}

public class MaxCounters
{
    public int[] solution(int N, int[] A)
    {
        int[] counters = new int[N];
        int max = 0;
        int all_max = 0;
        int last_all_max = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == N + 1)
            {
                all_max = 1;
                last_all_max = max;
            }
            else
            {
                if (all_max > 0)
                {
                    max++;
                    counters[A[i] - 1] = max;
                    all_max = 0;
                }
                else
                {
                    if (counters[A[i] - 1] < last_all_max)
                    {
                        counters[A[i] - 1] = last_all_max;
                    }

                    counters[A[i] - 1]++;

                    if (counters[A[i] - 1] > max)
                    {
                        max = counters[A[i] - 1];
                    }
                }
            }
        }

        for (int i = 0; i < counters.length; i++)
        {
            if (all_max > 0)
            {
                counters[i] = max;
            }
            else if (counters[i] < last_all_max)
            {
                counters[i] = last_all_max;
            }
        }

        return counters;
    }
}

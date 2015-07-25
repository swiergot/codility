public class GenomicRangeQuery
{
    public int[] solution(String S, int[] P, int[] Q)
    {
        int[] A = new int[S.length() + 1];
        int[] C = new int[S.length() + 1];
        int[] G = new int[S.length() + 1];
        int[] T = new int[S.length() + 1];

        for (int i = 1; i < S.length() + 1; i++)
        {
            A[i] = A[i - 1] + (S.charAt(i - 1) == 'A' ? 1 : 0);
            C[i] = C[i - 1] + (S.charAt(i - 1) == 'C' ? 1 : 0);
            G[i] = G[i - 1] + (S.charAt(i - 1) == 'G' ? 1 : 0);
            T[i] = T[i - 1] + (S.charAt(i - 1) == 'T' ? 1 : 0);
        }

        int[] ret = new int[P.length];

        for (int i = 0; i < P.length; i++)
        {
            int p = P[i];
            int q = Q[i];

            if (A[q + 1] > A[p])
            {
                ret[i] = 1;
            }
            else if (C[q + 1] > C[p])
            {
                ret[i] = 2;
            }
            else if (G[q + 1] > G[p])
            {
                ret[i] = 3;
            }
            else if (T[q + 1] > T[p])
            {
                ret[i] = 4;
            }
        }

        return ret;
    }
}

import java.util.Arrays;

public class Distinct
{
    public int solution(int[] A)
    {
        Arrays.sort(A);
        int distinct = (A.length == 0 ? 0 : 1);

        for (int i = 1; i < A.length; i++)
        {
            if (A[i] != A[i - 1])
            {
                distinct++;
            }
        }

        return distinct;
    }
}

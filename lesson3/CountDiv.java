public class CountDiv
{
    public int solution(int A, int B, int K)
    {
        if (A == B)
        {
            return (A % K) == 0 ? 1 : 0;
        }
        else if (A == 0)
        {
            return B / K + 1;
        }
        else
        {
            int a = (A - 1) / K + 1;
            int b = B / K + 1;
            return b - a;
        }
    }
}

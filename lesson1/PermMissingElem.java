class PermMissingElem
{
    public int solution(int[] A)
    {
        int o = 0;
        int s = 0;

        for (int i = 0; i < A.length; i++)
        {
            o += i + 1;
            s += A[i];
        }

        o += A.length + 1;

        return o - s;
    }
}
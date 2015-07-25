public class PassingCars
{
    public int solution(int[] A)
    {
        int east = 0;
        int passing = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 0)
            {
                east++;
            }
            else
            {
                passing += east;

                if (passing > 1000000000)
                {
                    return -1;
                }
            }
        }

        return passing;
    }
}

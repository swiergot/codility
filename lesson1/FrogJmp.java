class FrogJmp
{
    public int solution(int X, int Y, int D)
    {
        return Double.valueOf(Math.ceil((1.0 * Y - X) / D)).intValue();
    }
}
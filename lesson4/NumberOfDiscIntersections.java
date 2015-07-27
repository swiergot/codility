import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberOfDiscIntersections
{
    public int solution(int[] A)
    {
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < A.length; i++)
        {
            edges.add(new Edge(((long) i) - ((long) A[i]), true));
            edges.add(new Edge(((long) i) + ((long) A[i]), false));
        }

        Collections.sort(edges, new EdgeComparator());

        long discs = 0;
        long intersecting = 0;

        for (Edge edge : edges)
        {
            if (edge.begin)
            {
                intersecting += discs;

                if (intersecting > 10000000)
                    return -1;

                discs++;
            }
            else
            {
                discs--;
            }
        }

        return (int) intersecting;
    }

    class Edge
    {
        private long x;
        private boolean begin;

        public Edge(long x, boolean begin)
        {
            this.x = x;
            this.begin = begin;
        }
    }

    class EdgeComparator implements Comparator<Edge>
    {
        @Override
        public int compare(Edge o1, Edge o2)
        {
            int x = cmp(o1.x, o2.x);

            if (x == 0)
            {
                return cmp(o1.begin, o2.begin);
            }
            else
            {
                return x;
            }
        }

        private int cmp(long x1, long x2)
        {
            if (x1 < x2) return -1;
            if (x1 == x2) return 0;
            return 1;
        }

        private int cmp(boolean b1, boolean b2)
        {
            if (b1 && !b2) return -1;
            if ((b1 && b2) || (!b1 && !b2)) return 0;
            return 1;
        }
    }
}

/**
 * Created by Xander on 1/22/2015.
 */
import java.util.*;
import java.util.Set;
import java.util.HashSet;
public class SetHelper {

    public static Set<Movie> intersect(Set<Movie> s1, Set<Movie> s2)
    {
        Set<Movie> intersection = new HashSet<Movie>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public Set<Movie> union(Set<Movie> s1, Set<Movie> s2)
    {
        Set<Movie> union = new HashSet<Movie>(s1);
        union.addAll(s2);
        return union;
    }

    public Set<Movie> difference(Set<Movie> s1, Set<Movie> s2)
    {
        Set<Movie> difference = new HashSet<Movie>(s1);
        difference.removeAll(s2);
        return difference;
    }

    public Set<Movie> symDiff(Set<Movie> s1, Set<Movie> s2)
    {
        Set<Movie> unionOfS1AndS2 = union(s1, s2);
        Set<Movie> intersectOfS1AndS2 = intersect(s1, s2);
        Set<Movie> symDiff = difference(unionOfS1AndS2, intersectOfS1AndS2);
        return symDiff;
    }

}
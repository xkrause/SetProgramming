import java.util.*;

/**
 * Created by Xander on 1/22/2015.
 */
public class MovieDriver {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Moviefone");

        Movie m1 = new Movie("Frozen", 2014);
        Movie m2 = new Movie("Star Trek", 1979);
        Movie m3 = new Movie("Hunger Games", 2012);
        Movie m4 = new Movie("The Lego Movie", 2014);
        Movie m5 = new Movie("Star Wars Episode VII", 2016);

        Set<Movie> library = new HashSet<Movie>();  //HashSet or TreeSet
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> recentlyWatched = new HashSet<Movie>();
        Set<Movie> comedies = new HashSet<Movie>();
        Set<Movie> dramas = new HashSet<Movie>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);

        favorites.add(m3);
        favorites.add(m4);

        recentlyWatched.add(m1);
        recentlyWatched.add(m3);
        recentlyWatched.add(m4);

        comedies.add(m1);
        comedies.add(m4);

        dramas.add(m3);

        System.out.println("Library is " + library);
        System.out.println("Favorites are " + favorites);

        SetHelper helper = new SetHelper();

        //find the intersection of watched and dramas
        Set<Movie> watchedDramas = helper.intersect(recentlyWatched, dramas);
        Set<Movie> unwatched = helper.difference(library, recentlyWatched);

        //comedies I havent seen
        Set<Movie> unwatchedComs = helper.difference(unwatched, comedies);

        //movies after 2010 I havent watched
        Set<Movie> unwatchedNewReleases = new HashSet<Movie>();
        Iterator<Movie> currMovie = unwatched.iterator();
        while (currMovie.hasNext())
        {
            Movie temp = currMovie.next();
            if (temp.getYear() >= 2010)
            {
                unwatchedNewReleases.add(temp);
            }
        }


        Map<Movie, Integer> movieViews = new HashMap<Movie, Integer>();
        movieViews.put(m3, 5);
        movieViews.put(m5, 1);
        movieViews.put(m1, 0);
        movieViews.put(m1, 6);
        System.out.println(movieViews);

        Queue<Movie>playList=new LinkedList<Movie>();
        playList.add(m2);
            //adds movie m2 to the end of the playlist
        playList.add(m4);
            //adds movie m4 to the playList
        firstToPlay=playList.element();
            //peek at the first movie in the playList
        playList.remove();
            //removes the first movie in the playList
        playList.remove();

    }
}

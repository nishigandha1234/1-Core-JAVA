/*Question 12: Write a Java program to create a Movie class and count how many movies have rating greater than 4.
Description: Create Movie class with movieId, movieName and rating. Initialize using constructor. Store movie objects and count movies having rating above 4.
INPUT: Enter 4 Movies: 1 Leo 4.5 2 Jawan 3.8 3 Pathan 4.2 4 Tiger 3.5
OUTPUT: Movies with rating above 4: 2*/
 
class Movie
{
	private int movieId;
	private String movieName;
	private double rating;

	Movie(int movieId, String movieName, double rating)
	{
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	public void setMovieId(int movieId)
	{
		this.movieId = movieId;
	}
	public int getMovieId()
	{
		return movieId;
	}
	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setRating(double rating)
	{
		this.rating = rating;
	}
	public double getRating()
	{
		return rating;
	}
}
public class MovieApplication 
{
	public static void main(String x[])
	{
		Movie[] movie = new Movie[4];
		movie[0] = new Movie(1, "Leo",4.5);
		movie[1] = new Movie(2,"Jawan" ,3.8);
		movie[2] = new Movie(3, "Pathan", 4.2);
		movie[3] = new Movie(4, "Tiger", 3.5);
			
		int count = 0;
		for(int i = 0 ; i < movie.length ; i++)
		{
			if(movie[i].getRating() > 4)
				count++;
		}
		System.out.println("Movies with rating above 4: " + count);
	}
}
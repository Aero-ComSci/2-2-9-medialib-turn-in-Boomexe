/*
 * Activity 2.2.7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie {
  private String title;
  private double duration;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, double d) {
    title = t;
    duration = d;
    rating = 0;
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }

  public String toString() {
    String info = "\"" + title + "\", is " + duration + "hrs long, rating is " + rating;
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public void adjustRating(int newRating) {
    int ratingToPut = newRating + rating;
    if (0 <= ratingToPut && ratingToPut <= 10) {
      rating = newRating;
    }
  }

  public boolean equals(Movie other) {
    if (other.getTitle() == this.title && other.getDuration() == this.duration) {
      return true;
    }

    return false;
  }
}
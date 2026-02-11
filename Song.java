/*
 * Minimal Song class for MediaLibrary program
 */
public class Song {
  private String title;
  private int rating;

  public Song(String t) {
    title = t;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public void adjustRating(int r) {
    int newRating = rating + r;
    if (0 <= newRating && newRating <= 10) {
      rating = newRating;
    }
  }

  public String toString() {
    return "\"" + title + "\" with rating " + rating;
  }

  public boolean equals(Song other) {
    if (other == null) return false;
    return this.title.equals(other.getTitle());
  }
}

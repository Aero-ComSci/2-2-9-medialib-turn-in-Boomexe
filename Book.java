/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author + " with rating " + rating;
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int newRating) {
    int ratingToPut = newRating + rating;
    if (0 <= ratingToPut && ratingToPut <= 10) {
      rating = newRating;
    }
  }

  public boolean equals(Book other) {
    if (other.getTitle() == this.title && other.getAuthor() == this.author) {
      return true;
    }

    return false;
  }
}
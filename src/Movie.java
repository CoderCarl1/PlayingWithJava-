package src;

import java.util.Set;

public class Movie {
  private static final Set<String> VALIDRATINGS = Set.of("G", "PG", "PG-13", "R", "NR");
  private String title;
  private String director;
  private String rating;

  public Movie(String title, String director, String rating) {
    this.setTitle(title);
    this.setDirector(director);
    this.setRating(rating);
  }

  public void setRating(String rating) {
    if (VALIDRATINGS.contains(rating)) {
      this.rating = rating;
    } else {
      System.out.print("The rating provided was not valid\n" + "The valid types are: G, PG, PG-13, R, and NR\n"
          + "The rating has been set to NR - Not Rated");
      this.rating = "NR";
    }
  }

  public String getRating() {
    return this.rating;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getDirector() {
    return this.director;
  }

}

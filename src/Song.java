package src;

public class Song {
  private String title;
  private String artist;
  private int length;
  private static int songsCount = 0;

  public Song(String title, String artist, int length) {
    this.setTitle(title);
    this.setArtist(artist);
    this.setLength(length);
    songsCount++;
    // System.out.println("song Count: " + songsCount);
  }

  public int getSongsCount(){
    return songsCount;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return this.artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public int getLength() {
    return this.length;
  }

  public void setLength(int length) {
    this.length = length;
  }
}

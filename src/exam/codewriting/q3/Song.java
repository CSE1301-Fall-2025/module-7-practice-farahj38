package exam.codewriting.q3;

/*
 * We wish to create a Song class. A song has-a(n):
	name
	artist
	duration (in seconds)
 */
public class Song {
	
	// Define your instance variables here
	private String name;
	private String artist;
	private int duration;
	// Write the constructor for the Song class
	public Song(String name, String artist, int duration) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	public String getName () {
		return name; //FIXME
	}
	public String getArtist() {
		return artist;
	}
	public int getDuration() {
		return duration;
	}
	
	public String toString () {
		return name + " by " + artist + ": " + duration + " seconds."; //FIXME
	}
	
	/**
	* When two songs are mashed up, a new Song should be created and returned.
	* The name and artist of the new song should contain both names and both
	* artists from the original songs, and the duration should be the average
	* of the durations of the original songs.
	*/
	public Song mashUp ( Song other ) {
		String joinedName = this.name + " " + other.getName();
		String joinedArtist = this.artist + " " + other.getArtist();
		int joinedDuration = (this.duration + other.getDuration())/2;
		Song mashedUpSong = new Song(joinedName, joinedArtist, joinedDuration);
		return mashedUpSong; //FIXME
	}
	public static void main(String[] args) {
		Song goat = new Song("Love Me Again", "John Newman", 240);
		Song secondGoat = new Song("Notion", "The Rare Occasions", 196);
		System.out.println(goat.mashUp(secondGoat));
	}
}

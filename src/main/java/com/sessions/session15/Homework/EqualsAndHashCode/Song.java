package com.sessions.session15.Homework.EqualsAndHashCode;

public class Song
{
    //Create a Song class with title, artist, and length fields.
    // Implement the equals() method to check only the title and artist fields.
    // Implement the hashCode() method to use the title and artist fields to calculate the hash code.
    // Test that two instances with the same title and artist return true for equals() and have the same
    // hash code.
    public String title;
    public String artist;
    public int lengthFields;

    public Song(String title, String artist, int lengthFields)
    {
        this.title = title;
        this.artist = artist;
        this.lengthFields = lengthFields;
    }

    // Metoda equals() compară două obiecte Song doar pe baza câmpurilor title și artist.
    @Override
    public boolean equals(Object object)
    {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Song song = (Song) object;

        // Verificăm dacă title și artist sunt egale.
        return title.equals(song.title) && artist.equals(song.artist);
    }

    // Metoda hashCode() calculează codul hash pe baza câmpurilor title și artist.
    @Override
    public int hashCode()
    {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;
    }

    public static void main(String[] args)
    {
        // Creăm două instanțe de Song cu aceeași title și artist.
        Song song1 = new Song("Song A", "Artist X", 180);
        Song song2 = new Song("Song A", "Artist X", 200);

        // Testăm metoda equals() pentru egalitate.
        boolean areEqual = song1.equals(song2);
        System.out.println("Are equal: " + areEqual);  // Va afișa "Are equal: true"

        // Testăm metoda hashCode() pentru coduri hash identice.
        System.out.println("HashCode for song1: " + song1.hashCode());
        System.out.println("HashCode for song2: " + song2.hashCode());  // Acestea vor fi identice
    }
}

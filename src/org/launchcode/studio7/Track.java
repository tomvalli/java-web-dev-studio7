package org.launchcode.studio7;

public class Track {
    private final String artist, trackName;
    private final int trackNumber;
    private final double trackLengthSeconds;

    public Track(String artist, String trackName, int trackNumber, double trackLengthSeconds) {
        this.artist = artist;
        this.trackName = trackName;
        this.trackNumber = trackNumber;
        this.trackLengthSeconds = trackLengthSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String getTrackName() {
        return trackName;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public double getTrackLengthSeconds() {
        return trackLengthSeconds;
    }
}

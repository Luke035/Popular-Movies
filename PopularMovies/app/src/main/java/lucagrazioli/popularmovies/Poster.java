package lucagrazioli.popularmovies;

import java.io.Serializable;


public class Poster implements Serializable{
    private String title;
    private String image_url;
    private double voteAverage;
    private String overview;
    private String releaseDate;

    public Poster(String title, String image_url, double voteAverage, String overview, String releaseDate) {
        this.title = title;
        this.image_url = image_url;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public String getTitle() {
        return title;
    }

    public String getImage_url() {
        return image_url;
    }

    public double getVoteAverage() {
        return voteAverage;
    }
}

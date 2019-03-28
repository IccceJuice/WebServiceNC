package team25.musiclibrary.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "track")
@Table(name = "track", schema = "music_store", catalog = "")
public class Track{

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "album")
    private String album;
    @Column(name = "duration")
    private int duration;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "artist_track",
            joinColumns = { @JoinColumn(name = "track_id") },
            inverseJoinColumns = { @JoinColumn(name = "artist_id") })
    private List<Artist> artists = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "genre_track",
            joinColumns = { @JoinColumn(name = "track_id") },
            inverseJoinColumns = { @JoinColumn(name = "genre_id") })
    private List<Genre> genres = new ArrayList<>();

    public Track() {
    }

    public Track(String name, String album, int duration) {
        this.name = name;
        this.album = album;
        this.duration = duration;
    }

    public String getArtists() {
        String artistsNames = "";
        int artistsSize = artists.size();
        for (int i = 0; i < artistsSize; ++i){
            if (i == 1) {
                artistsNames = artistsNames.concat(" feat. ");
            }
            artistsNames = artistsNames.concat(artists.get(i).getName());
            if(i > 1 && i < artistsSize - 1){
                artistsNames += ", ";
            }
        }
        return artistsNames;
    }

    public String getGenres() {
        String genresNames = "";
        int genresSize = genres.size();
        for (int i = 0; i < genresSize; ++i){
            if(i > 0){
                genresNames += ", ";
            }
            genresNames = genresNames.concat(genres.get(i).getName());
        }
        return genresNames;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}

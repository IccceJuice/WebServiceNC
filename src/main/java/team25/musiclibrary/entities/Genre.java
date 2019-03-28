package team25.musiclibrary.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "genre")
@Table(name = "genre", schema = "music_store", catalog = "")
public class Genre{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "rating")
    private int rating;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "genres")
    private List<Track> tracks = new ArrayList<>();

    public Genre(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Genre() {
    }

    public String getTracks() {
        String tracksNames = "";
        int tracksSize = tracks.size();
        for (int i = 0 ; i < tracksSize; ++i){
            if(i > 0){
                tracksNames += ", ";
            }
            tracksNames = tracksNames.concat(tracks.get(i).getName());
        }
        return tracksNames;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

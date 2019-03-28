package team25.musiclibrary.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "artist")
@Table(name = "artist", schema = "music_store", catalog = "")
public class Artist{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "artists")
    private List<Track> tracks = new ArrayList<>();

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Artist() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package team25.musiclibrary.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "track")
@Table(name = "track", schema = "webserver", catalog = "")
public class Track implements Serializable{

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


    public Track() {
    }

    public Track(String name, String album, int duration) {
        this.name = name;
        this.album = album;
        this.duration = duration;
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

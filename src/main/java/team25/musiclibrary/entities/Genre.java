package team25.musiclibrary.entities;


import javax.persistence.*;

@Entity(name = "genre")
@Table(name = "genre", schema = "music_store", catalog = "")
public class Genre {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "rating")
    private int rating;

    public Genre(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Genre() {
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

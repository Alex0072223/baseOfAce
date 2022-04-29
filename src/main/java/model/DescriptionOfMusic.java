package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "description_of_music")
public class DescriptionOfMusic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*поставить авто для теста*/
    private int id;

    @Column(name = "name_of_song", nullable = false, length = 100)
    private String nameOfSong;
    @Column(name = "duration_of_song", nullable = false)
    private double duration;
    @Column(name = "description_of_song", nullable = false)
    private String description;

    @OneToMany(mappedBy = "descriptionOfMusic")
    private List<GenreOfMusic> genreOfMusicList = new ArrayList<>();

    @OneToMany(mappedBy = "albumOfMusic")
    private List<AlbumOfMusic> albumOfMusicList = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "m_to_m_author_description",
        joinColumns = @JoinColumn(name = "id_description"),
            inverseJoinColumns = @JoinColumn(name = "id_author")
    )
    private List<AuthorOfMusic> authorOfMusicList = new ArrayList<>();



    public DescriptionOfMusic(String nameOfSong, double duration, String description) {
        this.nameOfSong = nameOfSong;
        this.duration = duration;
        this.description = description;
    }
    public DescriptionOfMusic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

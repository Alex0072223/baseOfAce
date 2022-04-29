package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AuthorOfMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*поставить авто для теста*/
    private int id;

    @Column(name = "author_of_song", nullable = false, length = 100)
    private String authorOfSong;

    @ManyToMany(mappedBy = "authorOfMusicList")
    private List<DescriptionOfMusic> descriptionOfMusicList = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "m_to_m_author_album",
            joinColumns = @JoinColumn(name = "id_author"),
            inverseJoinColumns = @JoinColumn(name = "id_album")
    )
    private List<AlbumOfMusic> albumOfMusicList = new ArrayList<>();



    public AuthorOfMusic(String authorOfSong) {
        this.authorOfSong = authorOfSong;
    }
    public AuthorOfMusic() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorOfSong() {
        return authorOfSong;
    }

    public void setAuthorOfSong(String authorOfSong) {
        this.authorOfSong = authorOfSong;
    }

    public List<DescriptionOfMusic> getDescriptionOfMusicList() {
        return descriptionOfMusicList;
    }

    public void setDescriptionOfMusicList(List<DescriptionOfMusic> descriptionOfMusicList) {
        this.descriptionOfMusicList = descriptionOfMusicList;
    }

    public List<AlbumOfMusic> getAlbumOfMusicList() {
        return albumOfMusicList;
    }

    public void setAlbumOfMusicList(List<AlbumOfMusic> albumOfMusicList) {
        this.albumOfMusicList = albumOfMusicList;
    }
}

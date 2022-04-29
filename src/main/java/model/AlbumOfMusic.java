package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AlbumOfMusic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*поставить авто для теста*/
    private int id;

    @Column(name = "album_of_song", nullable = false, length = 100)
    private String albumOfSong;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "link_genre_to_album")
    private AlbumOfMusic albumOfMusic;

    @ManyToMany(mappedBy = "albumOfMusicList")
    private List<AuthorOfMusic> authorOfMusicList = new ArrayList<>();

    public AlbumOfMusic(String albumOfSong) {
        this.albumOfSong = albumOfSong;
    }

    public AlbumOfMusic() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumOfSong() {
        return albumOfSong;
    }

    public void setAlbumOfSong(String albumOfSong) {
        this.albumOfSong = albumOfSong;
    }

    public AlbumOfMusic getAlbumOfMusic() {
        return albumOfMusic;
    }

    public void setAlbumOfMusic(AlbumOfMusic albumOfMusic) {
        this.albumOfMusic = albumOfMusic;
    }

    public List<AuthorOfMusic> getAuthorOfMusicList() {
        return authorOfMusicList;
    }

    public void setAuthorOfMusicList(List<AuthorOfMusic> authorOfMusicList) {
        this.authorOfMusicList = authorOfMusicList;
    }
}

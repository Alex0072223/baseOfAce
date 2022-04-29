package model;


import javax.persistence.*;

@Entity
@Table(name = "genre_of_music")
public class GenreOfMusic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "genre", nullable = false, length = 150)
    private String genre;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "link_decriprtion_to_genre")
    private DescriptionOfMusic descriptionOfMusic;

    public GenreOfMusic( String genre) {
        this.genre = genre;
    }
    public GenreOfMusic(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public DescriptionOfMusic getDescriptionOfMusic() {
        return descriptionOfMusic;
    }

    public void setDescriptionOfMusic(DescriptionOfMusic descriptionOfMusic) {
        this.descriptionOfMusic = descriptionOfMusic;
    }
}

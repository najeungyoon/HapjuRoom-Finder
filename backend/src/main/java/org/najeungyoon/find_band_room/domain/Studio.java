package org.najeungyoon.find_band_room.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "studio")
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String place_key;


    @OneToMany(mappedBy = "studio", cascade = CascadeType.ALL)
    private List<Room> rooms = new ArrayList<>();



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_key() {
        return place_key;
    }

    public void setPlace_key(String placeKey) {
        this.place_key = placeKey;
    }
}

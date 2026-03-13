package org.najeungyoon.find_band_room.model;

public class StudioDTO {

    private long id;
    private String name;
    private String place_key;

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

    public void setPlace_key(String place_key) {
        this.place_key = place_key;
    }
}

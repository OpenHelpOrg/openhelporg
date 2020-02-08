package com.capstone.openhelp.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;


    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String details;

    @Column(columnDefinition = "DATETIME NOT NULL")
    private String date;

    private int time;

    @Column(nullable = false)
    private String summary;

    @Column(nullable = false)
    private String images;

    @Column(nullable = false)
    private String notes;

    @Column(nullable = false)
    private int vol_limit;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="event_cat",
            joinColumns={@JoinColumn(name="event_id")},
            inverseJoinColumns={@JoinColumn(name="category_id")}
    )
    private List<Category> categories;


    public Event() {

    }
    public Event(long id, String title, String location, String address, String details, String date, int time, String summary, String images, String notes, int limit) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.address = address;
        this.details = details;
        this.date = date;
        this.time = time;
        this.summary = summary;
        this.images = images;
        this.notes = notes;
        this.vol_limit = limit;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getLimit() {
        return vol_limit;
    }

    public void setLimit(int limit) {
        this.vol_limit = limit;
    }


    //setting event to user !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public void getUser(User user) {
//        return user;
//    }
}

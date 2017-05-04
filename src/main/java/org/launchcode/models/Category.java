package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by riddhisheth on 4/30/17.
 */

@Entity
public class Category {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    public Category(){}
    public Category(String name){}

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    @NotNull
    @Size(min=3, max=15)
    private String name;

    //public int setId(int id) { this.id = id; }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


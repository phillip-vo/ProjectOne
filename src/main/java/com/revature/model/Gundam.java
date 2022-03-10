package com.revature.model;

import javax.persistence.*;

@Entity
@Table(name="gundams")
public class Gundam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="gundam_id")
    private int gundamId;

    @Column(name="name")
    private String name;

    @Column(name="model")
    private String model;

    @Column(name="pilot")
    private String pilot;

    public Gundam() {}

    public Gundam(int id) {
        this.gundamId = id;
    }

    public Gundam(String model) {
        this.model = model;
    }

    public Gundam(String name, String model, String pilot) {
        this.name = name;
        this.model = model;
        this.pilot = pilot;
    }

    public int getGundamId() {
        return gundamId;
    }

    public void setGundamId(int gundamId) {
        this.gundamId = gundamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Gundam{" +
                "gundamId=" + gundamId +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", pilot='" + pilot + '\'' +
                '}';
    }
}

package vn.tribt.demo.model;

public class User {

    private String name;
    private String id;
    private int birthYear;
    private int experience;
    private String master;

    public User(String name, String id, int birthYear, int experience, String master) {
        super();
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
        this.experience = experience;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", birthYear=" + birthYear + ", experience=" + experience
                + ", master=" + master + "]";
    }

}

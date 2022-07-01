package exoRomain30juin.entity;

public class Subject {

    private int id;
    private String name;
    private int duration;
    private String difficulty;

    public Subject(int id, String name, int duration, String difficulty) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

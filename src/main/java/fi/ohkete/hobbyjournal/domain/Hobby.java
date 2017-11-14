package fi.ohkete.hobbyjournal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Hobby;
    private String date;
    private String time;
    private String desc;

    public Hobby() {
    }

    public Hobby(String Hobby, String date, String time, String desc) {
        this.Hobby = Hobby;
        this.date = date;
        this.time = time;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String Hobby) {
        this.Hobby = Hobby;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "Hobby='" + Hobby + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
package vo;

import org.springframework.data.annotation.Id;


public class Word {

    @Id
    private String id;

    private String english;
    private String spanish;

    public Word() {}

    public Word(String english, String spanish) {
        this.english = english;
        this.spanish = spanish;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, spanish='%s', english='%s']",
                id, spanish, english);
    }

    public String getContent() {
        return toString();
    }

}
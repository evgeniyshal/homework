package homework.lesson19;

import java.io.Serializable;
import java.time.LocalTime;


public class SimpleMessage implements Serializable {

    private String sender;
    private String text;
    private LocalTime time;

    public SimpleMessage(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public void setTime() {
        time = LocalTime.now();
    }

    public LocalTime getTime() {
        return time;
    }
}



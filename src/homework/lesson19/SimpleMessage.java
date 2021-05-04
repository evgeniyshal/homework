package homework.lesson19;

import java.io.Serializable;
import java.time.LocalDateTime;

    public class SimpleMessage implements Serializable {
        private String sender;
        private String text;
        private LocalDateTime dateTime;

        public SimpleMessage(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        public void setDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        @Override
        public String toString() {
            return "SimpleMessage{" +
                    "sender='" + sender + '\'' +
                    ", text='" + text + '\'' +
                    ", dateTime=" + dateTime +
                    '}';
        }
        public static SimpleMessage getMessage(String sender, String text){
            return new SimpleMessage(sender, text);
        }
    }



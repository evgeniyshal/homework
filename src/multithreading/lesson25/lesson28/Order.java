package multithreading.lesson25.lesson28;

import java.util.UUID;

public class Order {

    private String client;
    private UUID id;
    private boolean cocking;

    public void setClient(String client) {
        this.client = client;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCocking(boolean cocking) {
        this.cocking = cocking;
    }

    public String getClient() {
        return client;
    }

    public UUID getId() {
        return id;
    }

    public boolean isCocking() {
        return cocking;
    }
}

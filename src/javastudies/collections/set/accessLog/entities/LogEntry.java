package javastudies.collections.set.accessLog.entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class LogEntry {
    private String name;
    private Instant moment;

    public LogEntry(String name, Instant moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(name, logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

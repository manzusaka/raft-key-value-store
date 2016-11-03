package pl.edu.agh.messages.replication;

import pl.edu.agh.logs.LogEntry;
import pl.edu.agh.messages.RaftMessage;

public class AppendEntries implements RaftMessage {
    public int term;
    private LogEntry logEntry;

    public AppendEntries(int term) {
        this.term = term;
    }

    public AppendEntries(LogEntry log) {
        this.logEntry = log;
    }

    public LogEntry getLogEntry() {
        return logEntry;
    }
}

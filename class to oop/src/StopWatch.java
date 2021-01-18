public class StopWatch {
    public StopWatch() {
    }

    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void StartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void EndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
}

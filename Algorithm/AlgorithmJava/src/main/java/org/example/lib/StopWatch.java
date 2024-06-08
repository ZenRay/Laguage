package org.example.lib;

public class StopWatch {
    private long startTime;

    /**
     * Initialize start time
     */
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Reset Start Time
     */
    public void reset(){
        this.startTime = System.currentTimeMillis();
    }

    /**
     *
     * @return the elapsed time in seconds
     */
    public long getElapsedTime(){
        return (System.currentTimeMillis() - startTime) / 1000;
    }

}

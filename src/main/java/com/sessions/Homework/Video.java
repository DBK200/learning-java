package com.sessions.Homework;

public class Video {
    private int resolutionHeigth;
    private int resolutionWidth;

    public void pauseVideo() {
        System.out.println("Video is paused");
    }

    public Video(int resolutionHeigth, int resolutionWidth, String duration) {
        this.resolutionHeigth = resolutionHeigth;
        this.resolutionWidth = resolutionWidth;
        this.duration = duration;
    }

    public int getResolutionHeigth() {
        return resolutionHeigth;
    }

    public void setResolutionHeigth(int resolutionHeigth) {
        this.resolutionHeigth = resolutionHeigth;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    private String duration;
}

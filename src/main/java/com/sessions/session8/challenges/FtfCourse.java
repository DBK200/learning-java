package com.sessions.session8.challenges;

/**
 * This class is used to implement Face-to-Face courses.
 * @author  Catalin Martazan
 * */

public class FtfCourse extends Activity {
    private String location;
    private String trainer;

    public FtfCourse(String code, String name, String location, String trainer) {
        super(code, name);
        super.type = "FtF";
        this.location = location;
        this.trainer = trainer;
    }

}
package com.sessions.session22.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <h1>Builder Class Challenge</h1>
 * <p>Builder class for a NewCourse type object</p>
 **/
public class NewCourse {
    // Required variables
    private long id;
    private String code;
    private String name;
    private String type;

    // Optional variables
    private String description;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String parentCode;

    private NewCourse(NewCourseBuilder newCourseBuilder) {
        this.id = newCourseBuilder.id;
        this.code = newCourseBuilder.code;
        this.name = newCourseBuilder.name;
        this.description = newCourseBuilder.description;
        this.startDateTime = (newCourseBuilder.startDateTime == null)
                ? LocalDateTime.of(LocalDate.now(), LocalTime.of(8,30,0))
                : newCourseBuilder.startDateTime;
        this.endDateTime = (newCourseBuilder.endDateTime == null)
                ? this.startDateTime.plusHours(9)
                : newCourseBuilder.endDateTime;
        this.type = newCourseBuilder.type;
        this.parentCode = newCourseBuilder.parentCode;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public String getType() {
        return type;
    }

    public String getParentCode() {
        return parentCode;
    }

    // Class objects viewer
    @Override
    public String toString() {
        return "NewCourse{" +
                "id=" + id +
                ", code=" + format(code) +
                ", name=" + format(name) +
                ", description=" + format(description) +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", type=" + format(type) +
                ", parentCode=" + format(parentCode) +
                '}';
    }

    private String format(String text){
        return (text == null ? text : "'" + text + "'");
    }

    // Builder subclass
    public static class NewCourseBuilder {
        // Required variables - instanced by constructor
        private long id;
        private String code;
        private String name;
        private String type;

        // Optional variables - instanced by pseudo-setters
        private String description;
        private LocalDateTime startDateTime;
        private LocalDateTime endDateTime;
        private String parentCode;

        public NewCourseBuilder(long id, String code, String name, String type) {
            this.id = id;
            this.code = code;
            this.name = name;
            this.type = type;
        }

        // Required pseudo-setters
        public NewCourseBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public NewCourseBuilder withStartDateTime(LocalDateTime startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public NewCourseBuilder withEndDateTime(LocalDateTime endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public NewCourseBuilder withParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }

        // Parent class builder (i.e., NewCourse class)
        public NewCourse build(){
            return new NewCourse(this);
        }
    }
}

class NewCourseTest{
    public static void main(String[] args) {
        NewCourse course1 = new NewCourse.NewCourseBuilder(10, "PTB 0EL P.1", "Basic electrics", "Face-to-Face")
                .withDescription("Automotive basic electrics course")
                .build();
        System.out.println(course1);

        NewCourse course2 = new NewCourse.NewCourseBuilder(12, "PTB 0EC P.1", "Basic communication networks", "Face-to-Face")
                .withDescription("Automotive basic communication networks course")
                .withStartDateTime(LocalDateTime.now())
                .withEndDateTime(LocalDateTime.now().plusDays(2))
                .build();
        System.out.println(course2);
    }
}
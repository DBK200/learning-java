package com.sessions.session22.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <h1>Builder Class Challenge</h1>
 * <p>Builder class for a NewCourse type object</p>
 **/
public class Course {
    // Every variable is optional, i.e.,
    // they don't require initial values
    private long id;
    private String code;
    private String name;
    private String description;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String type;
    private String parentCode;

    private Course(CourseBuilder courseBuilder) {
        this.id = courseBuilder.id;
        this.code = courseBuilder.code;
        this.name = courseBuilder.name;
        this.description = courseBuilder.description;
        this.startDateTime = (courseBuilder.startDateTime == null)
                ? LocalDateTime.of(LocalDate.now(), LocalTime.of(8,30,0))
                : courseBuilder.startDateTime;
        this.endDateTime = (courseBuilder.endDateTime == null)
                ? this.startDateTime.plusHours(9)
                : courseBuilder.endDateTime;
        this.type = courseBuilder.type;
        this.parentCode = courseBuilder.parentCode;
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
    public static class CourseBuilder {
        private long id;
        private String code;
        private String name;
        private String description;
        private LocalDateTime startDateTime;
        private LocalDateTime endDateTime;
        private String type;
        private String parentCode;

        public static CourseBuilder createCourseBuilder(){
            return new CourseBuilder();
        }

        // Pseudo-setters
        public CourseBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public CourseBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public CourseBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public CourseBuilder withStartDateTime(LocalDateTime startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public CourseBuilder withEndDateTime(LocalDateTime endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public CourseBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public CourseBuilder withParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }

        // Parent class builder (i.e., NewCourse class)
        public Course build(){
            return new Course(this);
        }
    }
}

class CourseTest{
    public static void main(String[] args) {
        Course course1 = Course.CourseBuilder.createCourseBuilder()
                .withId(10)
                .withCode("PTB 0EL P.1")
                .withName("Basic electrics")
                .withType("Face-to-Face")
                .build();
        System.out.println(course1);

        Course course2 = new Course.CourseBuilder()
                .withId(10)
                .withCode("PTB 0EL P.1")
                .withName("Basic electrics")
                .withType("Face-to-Face")
                .build();
        System.out.println(course2);

        Course course3 = Course.CourseBuilder.createCourseBuilder()
                .withId(11)
                .withCode("PTB 0EC P.1")
                .withName("Basic communication networks")
                .withType("Face-to-Face")
                .withStartDateTime(LocalDateTime.now())
                .withEndDateTime(LocalDateTime.now().plusDays(2))
                .build();
        System.out.println(course3);
    }
}
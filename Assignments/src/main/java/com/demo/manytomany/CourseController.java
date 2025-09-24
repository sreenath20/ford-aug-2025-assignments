package com.abc.app.jpa_mappings.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @PostMapping
    public Course registerNewCourse(@RequestBody Course course) {
        return this.courseRepo.save(course);
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course) {
        return this.courseRepo.save(course);
    }

    @GetMapping("/all")
    public List<Course> getAllAvailableCourses() {
        return this.courseRepo.findAll();
    }

    // get all students enrolled to a course
    @GetMapping("/{course_id}/students")
    public List<StudentDto> getAllStudentsEnrolledForACourseById(@PathVariable Integer course_id) throws Exception {
        Course foundCourse = this.courseRepo.findById(course_id).orElseThrow(() -> new Exception("Course not found"));
        List<Student> studentList = foundCourse.getStudentList();
        if (studentList.size() < 1)
            throw new Exception("No students enrolled yet.");
        // wrap result into DTO
        List<StudentDto> studentDtoList = new ArrayList<>();
        for (Student student : studentList) {
            studentDtoList.add(new StudentDto(student.getId(), student.getName()));
        }
        return studentDtoList;
    }


}

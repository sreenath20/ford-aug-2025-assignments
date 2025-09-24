package com.abc.app.jpa_mappings.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseRepo courseRepo;

    // register new student
    @PostMapping
    public Student registerNewStudent(@RequestBody Student student) {

        return this.studentRepo.save(student);
    }

    // get all registered students
    @GetMapping("/all")
    public List<Student> getAllRegisteredStudents() {
        return this.studentRepo.findAll();
    }

    // enrolling student to course
    @PostMapping("/{student_id}/curse/{course_id}")
    public Student enrollStudentToCourseById(@PathVariable Integer student_id, @PathVariable Integer course_id) throws Exception {
        Student foundStudent = this.studentRepo.findById(student_id).orElseThrow(() -> new Exception("Student not found"));
        Course foundCourse = this.courseRepo.findById(course_id).orElseThrow(() -> new Exception("Course not found"));
        foundStudent.getCourseList().add(foundCourse);
        return this.studentRepo.save(foundStudent);
    }
    // get all courses enrolled by student
    @GetMapping("/{student_id}/courses")
    public List<Course> getAllCoursesEnrolledBystudentId(@PathVariable Integer student_id)throws Exception{
        Student foundStudent = this.studentRepo.findById(student_id).orElseThrow(() -> new Exception("Student not found"));
        List<Course> courseList = foundStudent.getCourseList();
        if(courseList.size()<1)
            throw new Exception("Student not yet enrolled to any course.");
        return courseList;
    }
}

let students = [
        { name: "Rahul", marks: 78 },
        { name: "Sneha", marks: 92 },
        { name: "Amit", marks: 45 },
        { name: "Priya", marks: 60 }
    ];

// Find all students who passed (marks ≥ 50)
    let passedStudents = students.filter(student => student.marks >= 50);
    console.log("Passed Students:", passedStudents);

// Calculate class average marks.
    let totalMarks = students.reduce((sum, student) => sum + student.marks, 0);
    let averageMarks = totalMarks / students.length;
    console.log("Class Average Marks:", averageMarks);

// Sort students by marks (highest to lowest).
    students.sort((a, b) => b.marks - a.marks);
    console.log("Students Sorted by Marks:", students);

//  Add a new property grade based on marks using map:
    //  ≥ 90 → A
    //  70–89 → B
    //  50–69 → C
    //  < 50 → F
    students = students.map(student => {
            if (student.marks >= 90) {
                student.grade = "A";
            } else if (student.marks >= 70) {
                student.grade = "B";
            } else if (student.marks >= 50) {
                student.grade = "C";
            } else {
                student.grade = "F";
            }
            return student;
        }); 
    console.log("Students with Grades:", students);
let students = [
 { name: "Rahul", marks: 78 },
 { name: "Sneha", marks: 92 },
 { name: "Amit", marks: 45 },
 { name: "Priya", marks: 60 }
];


let passedStudents=students.filter(students=>students.marks>=50);
console.log("Passed Students:",passedStudents);

let averageMarks=students.reduce((sum,student)=>sum+student.marks,0)/students.length;
console.log("Class Average Marks:",averageMarks);

let sortedStudents=[...students].sort((a,b)=>b.marks-a.marks);
console.log("Students sorted by Marks:",sortedStudents);
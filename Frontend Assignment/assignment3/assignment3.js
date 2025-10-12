
// Q1.Grocery Store Inventory System
// let inventory=[
//     { item: "Rice", quantity: 20, price: 40 },
//     { item: "Wheat", quantity: 15, price: 35 },
//     { item: "Sugar", quantity: 10, price: 50 }
// ];
//     //to add new item
//     inventory.push({item:'Salt',quantity:25,price:20});
//     console.log(JSON.stringify(inventory))

//     //update the rice to 45 by using find method

//     let ind=  inventory.find(list=>list.item="Rice");
//     ind.price=45;
//     console.log(JSON.stringify(inventory));

//     //Find total stock value (quantity * price for each).

//      let num=inventory.map(item=>item.quantity*item.price)
//      console.log(num);

//      //List items with quantity less than 15
//      let number=inventory.filter((item)=>(item.quantity>15))
//      console.log(number)



//Q2. School Student Report

// let students = [
// { name: "Rahul", marks: 78 },
// { name: "Sneha", marks: 92 },
// { name: "Amit", marks: 45 },
// { name: "Priya", marks: 60 }
// ];

// //1. Find all students who passed (marks ≥ 50). by using filter

//     let stud=students.filter((stud)=>stud.marks>=50)
//     console.log(JSON.stringify(stud));

// //2. Calculate class average marks. by using reduce

//     let avgfind=students.reduce((a,b)=>a+b.marks,0)
//     console.log(avgfind/students.length)

//     //3. Sort students by marks (highest to lowest). by using sorting

//     let sortStudent=students.sort((a,b)=>{return b.marks-a.marks});
//     console.log(JSON.stringify(sortStudent));

//     //4. Add a new property grade based on marks:

//     students.forEach((std)=>{
//         if(std.marks>=90){   
//         std.grade='A';
//         }
//         else if(std.marks>70 && std.marks<=89){
//             std.grade='B';
//         }
//         else if(std.marks>50 && std.marks<=69){
//             std.grade='C';
//         }
//         else{
//             std.grade='F';
//         }
//     }
//     );
//         console.log(students);



//Q3. Movie Ticket Booking System


// let bookings = [
//     { name: "John", movie: "Inception", seats: 2 },
//     { name: "Sara", movie: "Interstellar", seats: 3 },
//     { name: "Alex", movie: "Inception", seats: 1 }
// ];

// //1. Count how many total seats are booked for "Inception".

// let total = bookings.reduce((sum, booking) => {
//     if (booking.movie == 'Inception') {
//         return sum + booking.seats;
//     }
//     else {
//         return sum;
//     }
// }, 0);
// console.log(total);

// //2. Add a new booking { name: "Mia", movie: "Tenet", seats: 2 }.

// bookings.push({ name: "Mia", movie: "Tenet", seats: 2 });
// console.log(JSON.stringify(bookings));

// //3. Find all unique movie names.
// let movieName= new Set(bookings.map(a=>a.movie));
// movieName.forEach(n=>{
//     console.log(n);
// })



// //4. Print total number of booked seats for all movies.

// let totalNoSeats=bookings.reduce((sum,book)=>{
//     return sum+book.seats
// },0);
// console.log(totalNoSeats);



//Q4. Library Management System

//     let library = [
//  { title: "The Alchemist", author: "Paulo Coelho", available: true },
//  { title: "1984", author: "George Orwell", available: false },
//  { title: "Clean Code", author: "Robert C. Martin", available: true }
// ];

//     //1. List all available books.

//     library.forEach(book=>{
//         console.log(book.title);
//     })

    //2. Add a method borrowBook(title) that marks the book unavailable.

//  const borrowBook=function(titles){
//     let details=library.find(a=>{
//         if(a.title==titles){
//             return a;
//         }
//     })
//     if(details.available==true){
//         console.log("you can borrow book")
//         details.available=false;
//     }
//     else{
//         console.log("book is already borrowed");
//     }

//  }

//  borrowBook('1984');

 //3. Add a method returnBook(title) that marks it available again.

//  const returnBook=function(titles){
//   let details=library.find(a=>{
//         if(a.title==titles && a.available==false){
//             return a;
//         }
//     })
//     if(a.available==false){
//     console.log("successfully returned"); 
//     details.available=true;
//     } else{
//         console.log("book is not borrowed yet");
//     }
//  }
//  returnBook("1984");

 //4. Display total number of available books.
// let sum=0;
// library.filter(a=>{
//     if(a.available==true){
//         sum=sum+1;

//     }
// })
// console.log(sum);


let employees = [ 
  { id: 1, name: "Ravi", salary: 30000 }, 
  { id: 2, name: "Neha", salary: 45000 }, 
  { id: 3, name: "Ajay", salary: 25000 } 
]; 

employees.reduce((sum,employee)=>sum+employee.salary,0)
employees.map((emp)=>emp.salary*0.1+emp.salary);
console.log(employees.sort((a,b)=>b.salary-a.salary)[0]);
employee.push({id:4,name:'ak',salary:45677

})
console.log(employees)
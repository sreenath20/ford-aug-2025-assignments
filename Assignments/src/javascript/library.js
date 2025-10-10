let library = [
 { title: "The Alchemist", author: "Paulo Coelho", available: true },
 { title: "1984", author: "George Orwell", available: false },
 { title: "Clean Code", author: "Robert C. Martin", available: true }
]
let availableBooks = library.filter(b => b.available)
console.log("Available Books:", availableBooks.map(b => b.title))

let librarySystem = {
 books: library,
 borrowBook(title) {
   let book = this.books.find(b => b.title === title)
   if (book && book.available) {
     book.available = false
     console.log(`${title} borrowed successfully`)
   } else console.log(`${title} is not available`)
 },
 
 returnBook(title) {
   let book = this.books.find(b => b.title === title)
   if (book && !book.available) {
     book.available = true
     console.log(`${title} returned successfully`)
   } else console.log(`${title} was not borrowed`)
 },
 totalAvailable() {
   return this.books.filter(b => b.available).length
 }
}
librarySystem.borrowBook("Clean Code")
librarySystem.returnBook("1984")
console.log("Total Available Books:", librarySystem.totalAvailable())
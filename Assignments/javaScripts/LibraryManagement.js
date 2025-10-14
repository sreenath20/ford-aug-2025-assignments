let library = [
    { title: "The Alchemist", author: "Paulo Coelho", available: true },
    { title: "1984", author: "George Orwell", available: true },
    { title: "To Kill a Mockingbird", author: "Harper Lee", available: false }
];

// List all available books.
    console.log("Available Books: ", library.filter(book => book.available));

// Add a method borrowBook(title) that marks the book unavailable.
    function borrowBook(title) {
        let book = library.find(book => book.title === title);
        if (book && book.available) {
            book.available = false;
            console.log(`You have borrowed "${title}".`);
        } else {
            console.log(`Sorry, "${title}" is not available.`);
        }
    }
    borrowBook("The Alchemist");
    console.log("Books after borrowing: ", library);

// Add a method returnBook(title) that marks the book available.
    function returnBook(title) {
        let book = library.find(book => book.title === title);
        if (book && !book.available) {
            book.available = true;
            console.log(`You have returned "${title}".`);
        }
    }
    returnBook("The Alchemist");
    console.log("Books after returning: ", library);

// Display total number of available books.
    let availableBooksCount = library.filter(book => book.available).reduce((count,book) => count + 1, 0);
    console.log("Total Available Books: ", availableBooksCount);
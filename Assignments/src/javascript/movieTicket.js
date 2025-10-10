let bookings = [
 { name: "John", movie: "Inception", seats: 2 },
 { name: "Sara", movie: "Interstellar", seats: 3 },
 { name: "Alex", movie: "Inception", seats: 1 }
]
let inceptionSeats = bookings
 .filter(b => b.movie === "Inception")
 .reduce((sum, b) => sum + b.seats, 0)
console.log("Total seats booked for Inception:", inceptionSeats)
bookings.push({ name: "Mia", movie: "Tenet", seats: 2 })
console.log("Added new booking:", bookings[bookings.length - 1])
let uniqueMovies = [...new Set(bookings.map(b => b.movie))]
console.log("Unique Movies:", uniqueMovies)
let totalSeats = bookings.reduce((sum, b) => sum + b.seats, 0)
console.log("Total booked seats for all movies:", totalSeats)
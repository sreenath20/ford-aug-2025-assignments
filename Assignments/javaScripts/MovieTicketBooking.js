let bookings = [
        { name: "John", movie: "Inception", seats: 2 },
        { name: "Sara", movie: "Interstellar", seats: 3 },
        { name: "Alex", movie: "Inception", seats: 1 }
    ];

// Count how many total seats are booked for "Inception"
    let totalSeatsInception = bookings
        .filter(booking => booking.movie === "Inception")
        .reduce((total, booking) => total + booking.seats, 0);
    console.log(`Total seats booked for Inception: ${totalSeatsInception}`);

// Add a new booking { name: "Mia", movie: "Tenet", seats: 2 }.
    bookings.push({ name: "Mia", movie: "Tenet", seats: 2 });
    console.log("Updated bookings:", bookings);

// Find all unique movie names.
    let uniqueMovies = [...new Set(bookings.map(booking => booking.movie))];
    console.log("Unique movie names:", uniqueMovies);

// Print total number of booked seats for all movies.
    let totalSeats = bookings.reduce((total, booking) => total + booking.seats, 0);
    console.log(`Total seats booked for all movies: ${totalSeats}`);
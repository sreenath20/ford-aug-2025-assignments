let trips = [
        { destination: "Paris", days: 5, costPerDay: 200 },
        { destination: "London", days: 3, costPerDay: 250 },
        { destination: "Goa", days: 4, costPerDay: 100 }
    ];

// Calculate total cost for each trip.
    trips.map(trip => {
        trip.totalCost = trip.days * trip.costPerDay;
    });
    console.log("Trips with total costs:", trips);
// Add a new trip.
    trips.push({ destination: "Tokyo", days: 7, costPerDay: 300 });
    console.log("Added new trip to Tokyo :",trips);
// Find the most expensive trip.`
    let mostExpensiveTrip = trips.reduce((max, trip) => {
        let tripTotal = trip.days * trip.costPerDay;
        return tripTotal > max.total ? { destination: trip.destination, total: tripTotal } : max;
    }, { total: 0 });

// List trips cheaper than ₹1000 total.
    let affordableTrips = trips.filter(trip => (trip.days * trip.costPerDay) < 1000);
    console.log("Affordable trips (under ₹1000):", affordableTrips.map(trip => trip.destination));
let reviews = [ 
        { product: "Phone", rating: 4.5 }, 
        { product: "Laptop", rating: 4.8 }, 
        { product: "Headphones", rating: 3.9 }, 
        { product: "Laptop", rating: 4.6 } 
    ]; 

// Find average rating for "Laptop".
    let laptops = reviews.filter(review => review.product === "Laptop");
    let avgReview = laptops.reduce((total,review) => total+review.rating,0) / laptops.length;
    console.log("Avg rating of Laptop :",avgReview);

// List all products with rating ≥ 4. 
    let productsAbove4 = reviews.filter(review => review.rating >= 4);
    console.log("Products above 4 rating : ", productsAbove4);

//  Add a new review.   
    reviews.push({ product: "Headphones", rating: 4.3 });
    console.log("After adding new review : ", reviews);

//  Display highest-rated product.
    let maxRating = reviews.reduce((max, review) => review.rating > max ? review.rating : max, 0);
    let topRatedProduct = reviews.find((review) => review.rating === maxRating);
    console.log("Top rated product : ", topRatedProduct);    
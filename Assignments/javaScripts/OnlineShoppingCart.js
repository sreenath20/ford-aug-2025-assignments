let cart = [
        { item: "Laptop", price: 50000, quantity: 1 },
        { item: "Mouse", price: 1000, quantity: 2 }
    ];

// Add a new item { item: "Keyboard", price: 2000, quantity: 1 } 
    cart.push({ item: "Keyboard", price: 2000, quantity: 1 });
    console.log("After adding Keyboard:", cart);

// Update  quantity of "Mouse" to 3
    mouseProduct = cart.find(product => product.item === "Mouse");
    if (mouseProduct) {
        mouseProduct.quantity = 3;
    }
    console.log("After updating Mouse quantity:", cart);

// Calculate total cart value
    let totalValue = cart.reduce((total, product) => total + (product.price * product.quantity), 0);
    console.log("Total cart value:", totalValue);

// Remove "Laptop" from the cart
    cart = cart.filter(product => product.item !== "Laptop");
    console.log("After removing Laptop:", cart);
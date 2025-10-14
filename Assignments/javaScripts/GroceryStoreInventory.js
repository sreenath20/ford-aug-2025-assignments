let inventory = [
        { item: "Rice", quantity: 20, price: 40 },
        { item: "Wheat", quantity: 15, price: 35 },
        { item: "Sugar", quantity: 10, price: 50 }
    ];

// Add a new item { item: "Salt", quantity: 25, price: 20 }.
    inventory.push({ item: "Salt", quantity: 25, price: 20 });
    console.log(inventory);

// Update the price of "Rice" to 45 using find()
    let riceItem = inventory.find(product => product.item === "Rice");
    if (riceItem) {
        riceItem.price = 45;
    }
    console.log(inventory);
    

// Find total stock value (quantity * price for each)
    let totalStockValue = 0;
    for (let i = 0; i < inventory.length; i++) {
        totalStockValue += inventory[i].quantity * inventory[i].price;
        console.log(inventory[i].item, "Stock Value:", inventory[i].quantity * inventory[i].price);
    }
    console.log("Total Stock Value:", totalStockValue);

// List items with quantity less than 15
    let lowStockItems = inventory.filter(product => product.quantity < 15);
    console.log("Items with quantity less than 15:", lowStockItems);
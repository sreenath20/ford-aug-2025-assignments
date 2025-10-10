let inventory=[
    { item: "Rice", quantity: 20, price: 40 },
    { item: "Wheat", quantity: 15, price: 35 },
    { item: "Sugar", quantity: 10, price: 50 }
];

inventory.push({item:"Salt",quantity:25,price:20});

let riceItem=inventory.find(product=>product.item=="Rice");
if (riceItem) riceItem.price=45;
console.log("Updated Rice price:",riceItem);

let totalStockValue=inventory.reduce((sum,product)=>sum+(product.quantity*product.price),0);
console.log("Total stock value:",totalStockValue);

let lowStockItems=inventory.filter(product=>product.quantity<15);
console.log("Items with quantity less than 15:",lowStockItems);

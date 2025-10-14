let orders = [ 
        { id: 1, table: 5, items: ["Pizza", "Coke"], total: 500 }, 
        { id: 2, table: 3, items: ["Pasta"], total: 300 }, 
        { id: 3, table: 5, items: ["Garlic Bread"], total: 150 } 
    ]; 

// Find all orders placed by table 5. 
    let table5Orders = orders.filter(order => order.table === 5);
    console.log("Table 5 orders : ", table5Orders);

// Calculate total bill for table 5.
    let table5TotalBill = orders.reduce((totalBill,order) => {
        if(order.table === 5)
            totalBill += order.total;
        return totalBill;
    },0)
    console.log("Table 5 toral bill : ",table5TotalBill);

// Add a new order. 
    orders.push({id:4, table: 3,items:["Burger","French Fries"],total:240});
    console.log("After adding new order : ",orders);

//  Print a summary of total revenue.
    let totalRevenue = orders.reduce((totalRev, order) => totalRev + order.total,0);
    console.log("Total revenue : ",totalRevenue);





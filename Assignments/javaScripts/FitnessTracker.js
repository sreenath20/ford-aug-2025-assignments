let workouts = [ 
        { day: "Monday", steps: 8000, calories: 300 }, 
        { day: "Tuesday", steps: 10000, calories: 400 }, 
        { day: "Wednesday", steps: 7000, calories: 280 } 
    ]; 

// Find the total steps of the week. 
    let totalSteps = workouts.reduce((total, workout) => total + workout.steps,0);
    console.log("Total steps for the week: " + totalSteps);

// Find the day with maximum steps. 
    let maxSteps = workouts.reduce((max, workout) => workout.steps > max ? workout.steps : max, 0); 
    let maxStepDay = workouts.find((workout) => workout.steps === maxSteps);
    console.log("Max Steo day : ",maxStepDay);

// Add a new day’s workout. 
    workouts.push({day:"Thursday",steps:8500,calories:340});
    console.log("After adding new workout:",workouts);

// Calculate average calories burned.
    let totalCalories = workouts.reduce((total,workout) => total + workout.calories,0);
    let avgCaloriesBurnt = totalCalories / workouts.length;
    console.log("Avg calories burnt : ",avgCaloriesBurnt)



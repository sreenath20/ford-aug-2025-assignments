import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { CounterComponent } from './counter/counter.component';

@Component({
  selector: 'app-root',
  standalone:true,
  imports: [RouterOutlet,FormsModule],
   templateUrl: './app.component.html',
 
  styleUrl: './app.component.css'
})
export class AppComponent {
  title="hello";

  // Q1
  // name:string="Anjali Sharma";
  // designation:string="software Engineer";
  // profilePic:string="favicon.ico";

  //Q3
  // count:number=0;

  // onIncrement(){

  //   this.count++;
  // }
  // onDecrement(){
  //   if(this.count>0)
  //   this.count--;
  // }

  //Q4

  // feedback:string="";

  // reset(){
  //   this.feedback="";
  // }

  //Q5

  studentName:string="Rahul";
  isPresent="Absent";
  attendanceCount:number=0;
  profilePic:string="favicon.ico";

isStatus(){
  if(this.isPresent=="Absent"){
    this.isPresent="Present";
  }else
    this.isPresent="Absent";
}



}

package com.assignments.assignment7;

public class Driver {

    public static void main(String[] args) {

        try {
            ATM atm = new ATM();
            atm.validatePIN("1234");
            atm.validatePIN("123");
            atm.validatePIN("4123");

            TicketBooking ticketBooking = new TicketBooking();
            ticketBooking.bookTicket("Avengers",4);
            ticketBooking.bookTicket("Oppenheimer",7);

            FileUploader fileUploader = new FileUploader();
            fileUploader.uploadFile("report.pdf",15);
            fileUploader.uploadFile("movie.mp4",30);

            OrderService orderService = new OrderService();
            orderService.placeOrder("Pen",2);
            orderService.placeOrder("Ink Pot",0);

            ExamEligibility examEligibility = new ExamEligibility();
            examEligibility.checkEligibility("Alice",80);
            examEligibility.checkEligibility("Bob",60);

        }
        catch (InvalidPINException e) {
            System.out.println("Invalid Pin Error : "+e.getMessage());
        }
        catch (TicketLimitExceededException e) {
            System.out.println("Ticket Limit Error :"+e.getMessage());
        }
        catch (FileTooLargeException e) {
            System.out.println("File too large Error : "+e.getMessage());
        }
        catch (InvalidOrderQuantityException e){
            System.out.println("Invalid Order Quantity Error : "+e.getMessage());
        }
        catch (LowAttendanceException e) {
            System.out.println("Low Attendance Error : "+e.getMessage());
        }
    }
}

public class Ticket {
    constructor(String date , String sequential) {
        this.date = date;
        this.sequential = sequential;
        this.ticketNumber = date + sequential.toString().padStart(3, '0');
    }
}

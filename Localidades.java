public class Localidades {
        constructor(String name, Int price, Int capacity) 
        {
            this.name = name;
            this.price = price;
            this.capacity = capacity;
            this.soldTickets = 0;
        }
    
        canSellTickets(int cantidad) 
        {
            return this.soldTickets + cantidad <= this.capacity;
        }
    
        sellTickets(int cantidad) 
        {
            if (this.canSellTickets(cantidad)) {
                this.soldTickets += cantidad;
                return cantidad;
            } else {
                let availableTickets = this.capacity - this.soldTickets;
                this.soldTickets = this.capacity;
                return availableTickets;
            }
        }
    
        availableTickets() {
            return this.capacity - this.soldTickets;
        }
    }


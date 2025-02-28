class Sistematicket{
    constructor() {
        this.sections = 
            new Localidades("Localidad 1", 100, 100);
            new Localidades("Localidad 5", 500, 50);
            new Localidades("Localidad 10", 1000, 20);
        
        
        this.ticketCounter = 0;
        this.date = this.getfecha();
    }

    getfecha() {
        let date = new Date();
        return date.getFullYear().toString() + 
               (date.getMonth() + 1).toString().padStart(2, '0') + 
               date.getDate().toString().padStart(2, '0');
    }

    buyTickets(String name, String email, int cantidad, double budget, String Localidades)
     {
        let section = this.sections[sectionIndex];
        if (section.price * cantidad > budget) 
        {
            console.log("No tiene suficiente presupuesto.");
            return;
        }

        let ticketsToSell = section.sellTickets(cantidad);
        if (ticketsToSell > 0) 
        {
            this.ticketCounter += 1;
            let ticket = new Ticket(this.date, this.ticketCounter);
        }
            
        
        else
        {
            console.log("No hay suficientes boletos disponibles en esta sección.");
        }
        }

    showAvailability() {
        for (let i = 0; i < this.sections.length; i++) {
            
        }
    }
}

   
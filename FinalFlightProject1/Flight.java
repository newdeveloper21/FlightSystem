public class Flight
{  
   private String airline;
   private String flightnumber;
   private String flightorigin;
   private String destination;
   private double airfare;
   private String depart;
   private String arrival;
   private int availableseats;
   
   //Constructors
   public Flight() {
        this.airline = "";
        this.flightnumber = "";
        this.flightorigin = "";
        this.destination = "";
        this.airfare = 0.0;
        this.depart = "";
        this.arrival = "";
        this.availableseats = 0;
    }
   
   public Flight(String airline, String flightnumber, String flightorigin, String destination, double airfare, String depart, String arrival, int availableseats)
   {
      this.airline=airline;
      this.flightnumber=flightnumber;
      this.flightorigin=flightorigin;
      this.destination=destination;
      this.airfare=airfare;
      this.depart=depart;
      this.arrival=arrival;
      this.availableseats=availableseats;
      
      }
      
      //Getters and Setters
      
      public String getAirline(){
         return airline;
         }
        public void setAirline(String airline){
         this.airline =airline;
         
         }
         
      public String getFlightnumber(){
      return flightnumber;
      }
      
      public void setFlightnumber(String flightnumber)
      {
         this.flightnumber= flightnumber;
         }
       
       public String getFlightorigin(){
       
       return flightorigin;
       }
       
       public void setFlightorigin(String flightorigin)
       {
         this.flightorigin=flightorigin;
         }
         
         public String getDestination(){
       
       return destination;
       }
       
       public void setDestination(String destination)
       {
         this.destination=destination;
         }
         
         public double getAirfare(){
       
       return airfare;
       }
       
       public void setAirfare(double airfare)
       {
         this.airfare=airfare;
         }
         
         public String getDepart(){
       
       return depart;
       }
       
       public void setDepart(String depart)
       {
         this.depart=depart;
         }
         
         public String getArrival(){
       
       return arrival;
       }
       
       public void setArrival(String arrival)
       {
         this.arrival=arrival;
         }
         
         public int getAvailableseats(){
       
       return availableseats;
       }
       
       public void setAvailableseats(int availableseats)
       {
         this.availableseats=availableseats;
         }
         
         
         //toString method to display Flight details
         
         public String toString(){
         return  
                airline + " " 
                + flightnumber +" from "
                + flightorigin + " to " +
                  destination +
                " Airfare $" + airfare +
                ", Departure:" + depart +
                ", Arrival: " + arrival +
                ", Available Seats: " + availableseats 
                ;
                
                }
                }
         
         
      
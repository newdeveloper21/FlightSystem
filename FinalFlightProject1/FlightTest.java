import java.util.Scanner;
import java.util.Arrays;


public class FlightTest
{
   public static void main(String[] args)
   {
      
      Scanner scanner = new Scanner(System.in);
      
      //Asking User to input the no. of flights
      System.out.println("Enter the number of flights: ");
      int numFlights = scanner.nextInt();
      
      
      //Creating an Array of Flight Objects
      Flight[] flights= new Flight[numFlights];
      
      //Input Flight information using loop
      
      for(int i=0;i< numFlights; i++)
      {
         System.out.println("Enter the details for the flight" + (i+1));
         System.out.print("Airline Name: ");
         String airline = scanner.next();
         System.out.print("Flight Number: ");
         String flightnumber = scanner.next();
         System.out.print("Flight Origin: ");
         String flightorigin = scanner.next();
         System.out.print("Destination City: ");
         String destination = scanner.next();
         System.out.print("Airfare: ");
         double airfare = scanner.nextDouble();
         System.out.print("Departure Time: ");
         String depart= scanner.next();
         System.out.print("Arrival Time: ");
         String arrival = scanner.next();
         System.out.print("Seats Available: ");
         int availableseats = scanner.nextInt();
         
         //Create a new Flight object and add it to the array
         
         flights[i] = new Flight(airline, flightnumber, flightorigin, destination, airfare, depart, arrival, availableseats);
        }
        
        //Displaying the flight information before sorting
        
        System.out.println("Flight Information before sorting it according to FlightNumber");
        for(Flight flight: flights){
         System.out.println(flight +"\n");
         }
         
         System.out.println("Flight information after sorting it according to flightnumber\n");
         
         for (int i = 0; i < flights.length - 1; i++) {
            for (int j = i + 1; j < flights.length; j++) {
                if (flights[i].getFlightnumber().compareTo(flights[j].getFlightnumber()) > 0) {
                    // Swap the flights if they are in the wrong order
                    Flight temp = flights[i];
                    flights[i] = flights[j];
                    flights[j] = temp;
                    }
                    }
                    
         
         //Arrays.sort(flights, (a, b) -> a.getFlightnumber().compareTo(b.getFlightnumber()));

         for (Flight flight:flights){
         System.out.println(flight);
        }
}
}

}

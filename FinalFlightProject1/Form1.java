import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Form1 extends JFrame {

    private JTextArea textArea;
    private ArrayList<Flight> flightsList;

    public Form1() {
        setTitle("Sorted Flight Information");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create main panel with absolute layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        // Create text area to display flight information
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 250, 560, 300);
        mainPanel.add(scrollPane);

        // Create button to add flight and display sorted results
        JButton addButton = new JButton("Add Flight & Display Sorted Results");
        addButton.setBounds(150, 200, 300, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addFlight();
            }
        });
        mainPanel.add(addButton);

        add(mainPanel);

        flightsList = new ArrayList<>();
    }

    private void addFlight() {
        // Create dialog to input flight details
        JTextField airlineNameField = new JTextField();
        JTextField flightNumberField = new JTextField();
        JTextField flightOriginField = new JTextField();
        JTextField destinationField = new JTextField();
        JTextField airfareField = new JTextField();
        JTextField departureTimeField = new JTextField();
        JTextField arrivalTimeField = new JTextField();
        JTextField availableSeatsField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Airline Name:"));
        panel.add(airlineNameField);
        panel.add(new JLabel("Flight Number:"));
        panel.add(flightNumberField);
        panel.add(new JLabel("Flight Origin:"));
        panel.add(flightOriginField);
        panel.add(new JLabel("Destination:"));
        panel.add(destinationField);
        panel.add(new JLabel("Airfare:"));
        panel.add(airfareField);
        panel.add(new JLabel("Departure Time:"));
        panel.add(departureTimeField);
        panel.add(new JLabel("Arrival Time:"));
        panel.add(arrivalTimeField);
        panel.add(new JLabel("Available Seats:"));
        panel.add(availableSeatsField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Enter Flight Details",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            // Retrieve flight details entered by the user
            String airlineName = airlineNameField.getText();
            String flightNumber = flightNumberField.getText();
            String flightOrigin = flightOriginField.getText();
            String destination = destinationField.getText();
            double airfare = Double.parseDouble(airfareField.getText());
            String departureTime = departureTimeField.getText();
            String arrivalTime = arrivalTimeField.getText();
            int availableSeats = Integer.parseInt(availableSeatsField.getText());

            // Create a Flight object with user input
            Flight flight = new Flight(airlineName, flightNumber, flightOrigin, destination, airfare,
                    departureTime, arrivalTime, availableSeats);

            // Add the flight to the list of flights
            flightsList.add(flight);

            // Sort the flights based on flight number
            Flight[] flightsArray = flightsList.toArray(new Flight[flightsList.size()]);
            Arrays.sort(flightsArray, (a, b) -> a.getFlightnumber().compareTo(b.getFlightnumber()));

            // Display sorted flight information in the text area
            StringBuilder sb = new StringBuilder();
            for (Flight f : flightsArray) {
                sb.append(f.toString()).append("\n");
            }
            textArea.setText(sb.toString());
        }
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Form1 form = new Form1();
                form.setVisible(true);
            }
        });
    }
}  
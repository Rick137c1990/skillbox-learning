package airport;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static long findCountAircraftWithModelAirbus(Airport airport, String model) {
        return airport.getAllAircrafts().stream()
                .map(Aircraft::getModel)
                .filter(m -> m.startsWith(model))
                .count();
    }

    public static Map<String, Integer> findMapCountParkedAircraftByTerminalName(Airport airport) {
        return airport.getTerminals().stream()
                .collect(Collectors.toMap(
                        Terminal::getName,
                        terminal -> terminal.getParkedAircrafts().size()
                ));
    }

    public static List<Flight> findFlightsLeavingInTheNextHours(Airport airport, int hours) {
        Instant currentTime = Instant.now();
        Instant targetTime = currentTime.plusSeconds(hours * 3600);

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE)
                .filter(flight -> flight.getDate().isBefore(targetTime) && flight.getDate().isAfter(currentTime))
                .collect(Collectors.toList());
    }

    public static Optional<Flight> findFirstFlightArriveToTerminal(Airport airport, String terminalName) {
        return airport.getTerminals().stream()
                .filter(terminal -> terminal.getName().equals(terminalName))
                .flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType() == Flight.Type.ARRIVAL)
                .min((flight1, flight2) -> flight1.getDate().compareTo(flight2.getDate()));
    }
}
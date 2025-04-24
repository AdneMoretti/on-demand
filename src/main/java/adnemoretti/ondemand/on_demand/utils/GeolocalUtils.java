package adnemoretti.ondemand.on_demand.utils;

import adnemoretti.ondemand.on_demand.dto.AddressDTO;

public class GeolocalUtils {

    public static double haversine(double val) {
        return Math.pow(Math.sin(val / 2), 2);
    }

    public static double distance(AddressDTO origin, AddressDTO destination) {
        final double raio = 6371;

        double dLat = Math.toRadians(destination.latitude() - origin.latitude());
        double dLong = Math.toRadians(destination.longitude() - origin.longitude());

        double startLat = Math.toRadians(origin.latitude());
        double endLat = Math.toRadians(destination.latitude());

        double a = haversine(dLat) + Math.cos(startLat) * Math.cos(endLat) * haversine(dLong);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return raio * c;
    }
}

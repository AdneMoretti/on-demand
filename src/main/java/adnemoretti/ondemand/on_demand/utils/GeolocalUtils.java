package adnemoretti.ondemand.on_demand.utils;

import adnemoretti.ondemand.on_demand.models.Address;

public class GeolocalUtils {

    public static double haversine(double val) {
        return Math.pow(Math.sin(val / 2), 2);
    }

    public static double distance(Address origin, Address destination) {
        final double raio = 6371;

        double dLat = Math.toRadians(destination.getLatitude() - origin.getLatitude());
        double dLong = Math.toRadians(destination.getLongitude() - origin.getLongitude());

        double startLat = Math.toRadians(origin.getLatitude());
        double endLat = Math.toRadians(destination.getLatitude());

        double a = haversine(dLat) + Math.cos(startLat) * Math.cos(endLat) * haversine(dLong);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return raio * c;
    }
}

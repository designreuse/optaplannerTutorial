package cl.citymovil.optaplanner.services;

import java.util.Date;
import java.util.List;

import cl.citymovil.optaplanner.domain.DistanceTimeMatriz;
import cl.citymovil.optaplanner.domain.Location;
import cl.citymovil.optaplanner.domain.ScheduledCustomer;

public interface DatabaseService {

	void addVehiclePositionTest(Location location);
	void updateVehicleLastPosition(String vehicleId, double latitude, double longitude,Date date);
	void addVehiclePosition(String vehicleId, double latitude, double longitude,Date date);
	List<ScheduledCustomer> getScheduledCustomersByVehicleExternalId(String externalId);
	void updateScheduledCustomerRealArrivalTime(long scheduledCustomerId,Date date);
	

	
}

package cl.citymovil.optaplanner.dao;

import java.util.Date;

import cl.citymovil.optaplanner.domain.Location;

public interface VehiclePositionDAO {

	public void addVehiclePositionTest(Location location);

	public void addVehiclePosition(String external_id, double latitude, double longitude, Date date );
	
	public void updateVehicleLastPosition(String external_id, double latitude, double longitude, Date date );

}

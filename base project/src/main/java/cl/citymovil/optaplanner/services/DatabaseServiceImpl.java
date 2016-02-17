package cl.citymovil.optaplanner.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.citymovil.optaplanner.dao.ScheduledCustomerDAO;
import cl.citymovil.optaplanner.dao.VehiclePositionDAO;
import cl.citymovil.optaplanner.domain.Location;
import cl.citymovil.optaplanner.domain.ScheduledCustomer;

@Service
public class DatabaseServiceImpl implements DatabaseService{

	@Autowired
	VehiclePositionDAO vehiclePositionDAO;
	
	@Autowired
	ScheduledCustomerDAO scheduledCustomerDAO;
	
	public void updateVehicleLastPosition(String externalId, double latitude, double longitude,Date date)
	{
		vehiclePositionDAO.updateVehicleLastPosition(externalId, latitude, longitude, date);
		
	}
	
	public void addVehiclePosition(String externalId, double latitude, double longitude,Date date)
	{
		vehiclePositionDAO.addVehiclePosition(externalId, latitude, longitude, date);
	}

	@Override
	public List<ScheduledCustomer> getScheduledCustomersByVehicleExternalId(String externalId) {
		return scheduledCustomerDAO.getScheduledCustomersByVehicleExternalId(externalId);
	}

	@Override
	public void updateScheduledCustomerRealArrivalTime(long scheduledCustomerId,Date date) {
		
		scheduledCustomerDAO.updateScheduledCustomerRealArrivalTime(scheduledCustomerId, date);
		
	}

	@Override
	public void addVehiclePositionTest(Location location) {
		// TODO Auto-generated method stub
		
	}


	
}

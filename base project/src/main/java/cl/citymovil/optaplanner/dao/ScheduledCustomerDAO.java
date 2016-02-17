package cl.citymovil.optaplanner.dao;

import java.util.Date;
import java.util.List;

import cl.citymovil.optaplanner.domain.ScheduledCustomer;

public interface ScheduledCustomerDAO {
	
	List<ScheduledCustomer> getScheduledCustomersByVehicleExternalId(String externalId);
	void updateScheduledCustomerRealArrivalTime(long scheduledCustomerId, Date date ); 
	
}

package cl.citymovil.optaplanner.services;

import java.util.List;

import cl.citymovil.optaplanner.domain.Location;
import cl.citymovil.optaplanner.domain.ScheduledCustomer;

public interface GeoService {

	long isNearScheduledCustomer(List<ScheduledCustomer> scheduledCustomers, Location current);

}

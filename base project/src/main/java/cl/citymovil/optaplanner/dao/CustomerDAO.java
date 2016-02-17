package cl.citymovil.optaplanner.dao;

import java.util.List;

import cl.citymovil.optaplanner.domain.Customer;
import cl.citymovil.optaplanner.domain.Location;


public interface CustomerDAO {
	
	public List<Customer> getCustomerList();
	
	public List<Customer> getCustomerWithNewLocation();

    public void mergeLocation(Location loc);
    
    public void persistLocation(Location loc);
}

package cl.citymovil.optaplanner.dao;

import java.util.ArrayList;
import java.util.List;

import cl.citymovil.optaplanner.domain.Location;


public interface LocationDAO{
	
	public ArrayList<Location> getLocationList();
	
	public void updateLocation(long LocationId);

    public void mergeLocation(Location loc);
    
    public void persistLocation(Location loc);
    
    public void deleteLocation(long LocationId);
}

package cl.citymovil.optaplanner.services;

import cl.citymovil.optaplanner.domain.Location;
import cl.citymovil.optaplanner.domain.LocationTmp;

public interface DataBaseInteractionService {

	public Location makeLocationWithLocationTmp(LocationTmp locTmp);

}

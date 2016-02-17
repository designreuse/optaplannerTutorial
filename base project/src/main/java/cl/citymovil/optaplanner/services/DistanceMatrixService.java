package cl.citymovil.optaplanner.services;



import java.util.ArrayList;
import java.util.Map;

import cl.citymovil.optaplanner.domain.DistanceTimeData;
import cl.citymovil.optaplanner.domain.Location;
import cl.citymovil.optaplanner.util.DistanceTimeMatrixUtility;
import cl.citymovil.optaplanner.util.LocationContainer;
import cl.citymovil.optaplanner.util.RelationLocation;

public interface DistanceMatrixService {
	

	
	void PostProcessAlpha(	ArrayList<RelationLocation>  relationLocation);
	
	LocationContainer Preprocess();
	
	ArrayList<RelationLocation>  Process(LocationContainer locationConteiner);

	void PostProcess(	ArrayList<RelationLocation>  relationLocation);

}

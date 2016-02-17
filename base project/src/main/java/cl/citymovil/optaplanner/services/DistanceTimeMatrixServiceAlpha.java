package cl.citymovil.optaplanner.services;

import java.util.ArrayList;
import java.util.Map;

import cl.citymovil.optaplanner.domain.DistanceTimeData;
import cl.citymovil.optaplanner.domain.DistanceTimeDataComplete;
import cl.citymovil.optaplanner.domain.Location;
import cl.citymovil.optaplanner.util.LocationContainer;
import cl.citymovil.optaplanner.util.LocationContainerForGoogleAsk;
import cl.citymovil.optaplanner.util.RelationLocation;

public interface DistanceTimeMatrixServiceAlpha {
	
	Map<Long, Map<Long, DistanceTimeData>>  PreprocessAlpha(ArrayList <Location> arrayWithIdLocation);
	
	ArrayList<LocationContainerForGoogleAsk> PreprocessBeta(Map<Long, Map<Long, DistanceTimeData>> distanceTimeHashMap, ArrayList <Location> arrayWithIdLocation );
	
	ArrayList<RelationLocation>  Process(LocationContainerForGoogleAsk locationContainerForGoogle);
	
	void PostProcessAlpha(	ArrayList<RelationLocation>  relationLocation);
}

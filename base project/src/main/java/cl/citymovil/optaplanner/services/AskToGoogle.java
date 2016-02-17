package cl.citymovil.optaplanner.services;


import java.util.ArrayList;

import cl.citymovil.optaplanner.util.LocationContainer;
import cl.citymovil.optaplanner.util.LocationContainerForGoogleAsk;
import cl.citymovil.optaplanner.util.RelationLocation;

public interface AskToGoogle {
	
	public ArrayList<RelationLocation>  getDistanceByGoogle(LocationContainer locationConteiner);
	public ArrayList<RelationLocation>  getDistanceByGoogleAlpha(LocationContainerForGoogleAsk locationContainerForGoogle);
	public void getTimeByGoogle();

}

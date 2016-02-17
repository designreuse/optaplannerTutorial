package cl.citymovil.optaplanner.controllers;

import java.util.ArrayList;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.citymovil.optaplanner.services.DistanceMatrixService;
import cl.citymovil.optaplanner.util.LocationContainer;
import cl.citymovil.optaplanner.util.RelationLocation;

@Controller
@RequestMapping(value="/priceincrease.htm")
public class DistanceTimeMatrixController {
	
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private DistanceMatrixService distanceMatrixService;
    
    @RequestMapping(method = RequestMethod.GET)
    public void onSubmit()
    {
    	LocationContainer locationConteiner = distanceMatrixService.Preprocess();
    	if(locationConteiner==null){
    		System.out.println("No hay LocationTmp para procesar.");
    		
    	}else{
    	
	 logger.info(":::::: DESDE DISTANCETIME CONTROLLER ::::::::::");
		   	 locationConteiner.listLocation();
		   	 locationConteiner.listTmpLocation();
	   	
	   	
		   	logger.info(":::::: INICIANDO PROCESS ::::::::::");
		   	ArrayList<RelationLocation>  distanceMatrixList = distanceMatrixService.Process(locationConteiner);
		   	
		   	distanceMatrixService.PostProcess(distanceMatrixList);
   	
    	}

        
    }
//    protected void formBackingObject(HttpServletRequest request) throws ServletException {
//    }

    public void setLocationManager(DistanceMatrixService distanceMatrixService) {
        this.distanceMatrixService = distanceMatrixService;
    }

    public DistanceMatrixService getProductManager() {
        return distanceMatrixService;
    }
    
    

	

}

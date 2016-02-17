package cl.citymovil.optaplanner.services;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ServiceVRPImpl implements ServiceVRP{
	
	Logger logger = LoggerFactory.getLogger(getClass());

	private static final String solverConfig = "/cl/citymovil/route_pro/solver/config/vehicleRoutingSolverConfigTesting.xml";
	private Solver solver;
	private SolverFactory solverFactory;
	long secondsSpentLimit = 40;
	
	
	private void build() {
		solverFactory = SolverFactory.createFromXmlResource(solverConfig);
		solverFactory.getSolverConfig().getTerminationConfig().setSecondsSpentLimit(secondsSpentLimit);
		solver = solverFactory.buildSolver();
	}

}

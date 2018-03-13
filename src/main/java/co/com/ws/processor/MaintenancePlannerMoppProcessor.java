package co.com.ws.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.maintenance_planner_mopp.MoppRequest;
import co.com.ws.maintenance_planner_mopp.MoppResponse;
import mtx_sandbox_api.services.FlightsUpdateApi;
import mtx_sandbox_api.services.FlightsUpdateApiService;

public class MaintenancePlannerMoppProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		MoppResponse response = new MoppResponse();
		
		List soaList = exchange.getIn().getBody(List.class);
		MoppRequest requestMain = (MoppRequest) soaList.get(0);

		
		try {
			mtx_sandbox_api.services.MoppRequest request = new mtx_sandbox_api.services.MoppRequest();
			request.setAircraftIdentifier(requestMain.getAircratTailNumber());
			request.setAirport(requestMain.getAirport());
			request.setGate(requestMain.getGate());
			request.setDate(requestMain.getDate());
			
			FlightsUpdateApiService service = new FlightsUpdateApiService();
			FlightsUpdateApi port = service.getFlightsUpdateApiPort();
			String res = port.sendMopp(request);
			
			response.setCode("0");
			response.setDescription("Maintenance planner mopp code "+res+ " for AircratTailNumber "+requestMain.getAircratTailNumber());
			exchange.getOut().setBody(response);
		}catch(Exception e) {
			e.printStackTrace();
			response.setCode("1");
			response.setDescription("Failed: "+e.getMessage());
			exchange.getOut().setBody(response);
		}
	}

}
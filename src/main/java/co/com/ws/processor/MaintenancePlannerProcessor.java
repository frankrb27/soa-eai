package co.com.ws.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.maintenance_planner.MaintenancePlannerRequest;
import co.com.ws.maintenance_planner.MaintenancePlannerResponse;
import mtx_sandbox_api.services.FlightUpdateRequest;
import mtx_sandbox_api.services.FlightUpdateStatus;
import mtx_sandbox_api.services.FlightsUpdateApi;
import mtx_sandbox_api.services.FlightsUpdateApiService;

public class MaintenancePlannerProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		MaintenancePlannerResponse response = new MaintenancePlannerResponse();
		
		List soaList = exchange.getIn().getBody(List.class);
		MaintenancePlannerRequest requestMain = (MaintenancePlannerRequest) soaList.get(0);

		
		try {
			FlightUpdateRequest request = new FlightUpdateRequest();
			request.setAircraftIdentifier(requestMain.getAircratTailNumber());
			request.setArrivalAirport(requestMain.getArrivalAirport());
			request.setArrivalGate(requestMain.getArrivalGate());
			request.setDepartureAirport(requestMain.getDepartureAirport());
			request.setDepartureGate(requestMain.getDepartureGate());
			request.setEndDate(requestMain.getEndDate());
			request.setExternalKey(requestMain.getFlightExternalKey());
			request.setStartDate(requestMain.getStartDate());
			request.setStatus(FlightUpdateStatus.valueOf(requestMain.getStatus()));
			
			FlightsUpdateApiService service = new FlightsUpdateApiService();
			FlightsUpdateApi port = service.getFlightsUpdateApiPort();
			String res = port.update(request);
			
			response.setCode("0");
			response.setDescription("Maintenance planner code "+res+ " for AircratTailNumber "+requestMain.getAircratTailNumber());
			exchange.getOut().setBody(response);
		}catch(Exception e) {
			e.printStackTrace();
			response.setCode("1");
			response.setDescription("Failed: "+e.getMessage());
			exchange.getOut().setBody(response);
		}
	}

}
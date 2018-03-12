package co.com.ws.processor.invoke;

import mtx_sandbox_api.services.FlightUpdateRequest;
import mtx_sandbox_api.services.FlightsUpdateApi;
import mtx_sandbox_api.services.FlightsUpdateApiService;

public class InvokeSoapService {

	static String MESSAGE  = "<ser:update xmlns:ser='http://mtx-sandbox-api/services'><request><aircraftIdentifier>MK000012</aircraftIdentifier><arrivalAirport>CALI</arrivalAirport><arrivalGate>CAL-06</arrivalGate><departureAirport>BOGOTA</departureAirport><departureGate>BOG-01</departureGate><endDate>2018-01-01T19:00:00</endDate><externalKey>65478</externalKey><startDate>2018-01-01T14:00:00</startDate><status>ON_GOING</status></request></ser:update>";
	static String ENDPOINT = "http://localhost:9494/web-sandbox-api/endpoint/flights-update-api-1.0.0";
	public String updateFlight(FlightUpdateRequest request) throws Exception {
		FlightsUpdateApiService service = new FlightsUpdateApiService();
		FlightsUpdateApi port = service.getFlightsUpdateApiPort();
		return port.update(request);
	}

/*
	public static void main(String[] args) throws Exception	{  
		//creating object of program class to access methods  
		InvokeSoapService obj = new InvokeSoapService();  
		obj.customSendAndReceive();  
	}  

	// send to an explicit URI
	public void customSendAndReceive() throws Exception{
		FlightsUpdateApiService service = new FlightsUpdateApiService();
		FlightsUpdateApi port = service.getFlightsUpdateApiPort();
		FlightUpdateRequest request = new FlightUpdateRequest();	
		System.out.println(port.update(request));
	}  
*/
}

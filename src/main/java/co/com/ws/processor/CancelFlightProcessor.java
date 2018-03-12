package co.com.ws.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import co.com.rest.client.cancel_flight.CancelRequest;
import co.com.rest.client.cancel_flight.CancelResponse;
import co.com.ws.cancel_flight.CancelFlightRequest;
import co.com.ws.cancel_flight.CancelFlightResponse;

public class CancelFlightProcessor implements Processor {

	private static final String ENDPOINT = "http://localhost:9494/web-sandbox-api/endpoint/rest/cancel-api/process";
    public void process(Exchange exchange) throws Exception {
        CancelFlightResponse response = new CancelFlightResponse();
        List soaList = exchange.getIn().getBody(List.class);
        CancelFlightRequest cancel = (CancelFlightRequest) soaList.get(0);
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_XML_VALUE);
        headers.setContentType(MediaType.APPLICATION_XML);
        
        CancelRequest cancelRequest = new CancelRequest();
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<CancelRequest> requestBody = new HttpEntity<>(cancelRequest, headers);
        CancelResponse responseTemplate = restTemplate.postForObject(ENDPOINT, requestBody, CancelResponse.class);
        
        response.setCode("0");
        response.setDescription("Authorization code: "+responseTemplate.getId()+ " for AircratTailNumber: "+cancel.getAircratTailNumber());
        exchange.getOut().setBody(response);
        //http://localhost:9494/web-sandbox-api/endpoint/rest/cancel-api/process
    }

    /*
    public static void main(String arg[]) {
    	 HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_XML);
         
         co.com.rest.client.cancel_flight.CancelRequest cancelRequest = new co.com.rest.client.cancel_flight.CancelRequest();
         RestTemplate restTemplate = new RestTemplate();
         HttpEntity<co.com.rest.client.cancel_flight.CancelRequest> requestBody = new HttpEntity<>(cancelRequest, headers);
         CancelResponse response = restTemplate.postForObject(ENDPOINT, requestBody, CancelResponse.class);
         System.out.println(response.getId());
         
    }*/
}
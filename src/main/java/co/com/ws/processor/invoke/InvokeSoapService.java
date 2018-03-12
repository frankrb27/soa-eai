package co.com.ws.processor.invoke;

import javax.xml.bind.JAXBElement;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import mtx_sandbox_api.services.Update;
import mtx_sandbox_api.services.UpdateResponse;

public class InvokeSoapService extends WebServiceGatewaySupport{

	public String updateFlight(Update request) throws Exception {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
		marshaller.setContextPath("mtx_sandbox_api.services");
		marshaller.afterPropertiesSet();

		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);

		UpdateResponse response = ((JAXBElement<UpdateResponse>)(webServiceTemplate).marshalSendAndReceive("http://localhost:9494/web-sandbox-api/endpoint/flights-update-api-1.0.0",
				request,
				new SoapActionCallback("update"))).getValue();
		System.out.println(response.getReturn());
		return response.getReturn();
	}
}

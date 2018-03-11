package co.com.ws.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.maintenance_planner.MaintenancePlannerResponse;

public class MaintenancePlannerProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	MaintenancePlannerResponse maintenance = new MaintenancePlannerResponse();
        maintenance.setCode("0");
        maintenance.setDescription("OK");
        exchange.getOut().setBody(maintenance);
    }

}
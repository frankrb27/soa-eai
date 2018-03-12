package co.com.rest.client.cancel_flight;

import java.util.Date;

@javax.xml.bind.annotation.XmlRootElement
public class CancelFlightRequest {

	private String aircraftIdentifier;
	private String externalKey;
	private String description;
	private Date date;

	public CancelFlightRequest() {}

	public String getAircraftIdentifier() {
		return aircraftIdentifier;
	}

	public void setAircraftIdentifier(String aircraftIdentifier) {
		this.aircraftIdentifier = aircraftIdentifier;
	}

	public String getExternalKey() {
		return externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
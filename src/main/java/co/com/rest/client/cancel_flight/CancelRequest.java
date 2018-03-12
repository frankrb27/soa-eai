package co.com.rest.client.cancel_flight;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelRequest", propOrder = {
        "aircraftIdentifier","externalKey","description","date"
})
public class CancelRequest {

	private String aircraftIdentifier;
	private String externalKey;
	private String description;
	private Date date;

	public CancelRequest() {}

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
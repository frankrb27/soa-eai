<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:main="http://maintenance-planner.ws.com.co"
	exclude-result-prefixes="#default main">
	<xsl:template match="/">
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:ser="http://mtx-sandbox-api/services">
			<soapenv:Header />
			<soapenv:Body>
				<ser:update>
					<request>
						<aircraftIdentifier>
							<xsl:value-of
								select="//main:maintenancePlannerRequest/aircrat-tail-number" />
						</aircraftIdentifier>
						<arrivalAirport>
							<xsl:value-of select="//main:maintenancePlannerRequest/arrivalAirport" />
						</arrivalAirport>
						<arrivalGate>
							<xsl:value-of select="//main:maintenancePlannerRequest/arrivalGate" />
						</arrivalGate>
						<departureAirport>
							<xsl:value-of select="//main:maintenancePlannerRequest/departureAirport" />
						</departureAirport>
						<departureGate>
							<xsl:value-of select="//main:maintenancePlannerRequest/departureGate" />
						</departureGate>
						<endDate>
							<xsl:value-of select="//main:maintenancePlannerRequest/endDate" />
						</endDate>
						<externalKey>
							<xsl:value-of
								select="//main:maintenancePlannerRequest/flight-external-key" />
						</externalKey>
						<startDate>
							<xsl:value-of select="//main:maintenancePlannerRequest/startDate" />
						</startDate>
						<status>
							<xsl:value-of select="//main:maintenancePlannerRequest/status" />
						</status>
					</request>
				</ser:update>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>
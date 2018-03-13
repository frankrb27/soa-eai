<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:main="http://maintenance-planner.ws.com.co"
	exclude-result-prefixes="#default main">
	<xsl:template match="/">
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:ser="http://mtx-sandbox-api/services">
			<soapenv:Header />
			<soapenv:Body>
				<ser:sendMopp>
					<request>
						<aircraftIdentifier>
							<xsl:value-of
								select="//main:moppRequest/aircrat-tail-number" />
						</aircraftIdentifier>
						<airport>
							<xsl:value-of select="//main:moppRequest/airport" />
						</airport>
						<date>
							<xsl:value-of select="//main:moppRequest/date" />
						</date>
						<gate>
							<xsl:value-of select="//main:moppRequest/gate" />
						</gate>
					</request>
				</ser:sendMopp>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>
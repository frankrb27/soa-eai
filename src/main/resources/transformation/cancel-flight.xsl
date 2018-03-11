<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:aler="http://alert-on-air.ws.com.co" exclude-result-prefixes="#default aler">
	<xsl:template match="/">
		<security-incidents>
			<level>
				<xsl:value-of select="//aler:alertOnAirRequest/level" />
			</level>
			<description>
				<xsl:value-of select="//aler:alertOnAirRequest/description" />
			</description>
			<flight-external-key>
				<xsl:value-of select="//aler:alertOnAirRequest/flight-external-key" />
			</flight-external-key>
			<aircraft-tail-number>
				<xsl:value-of select="//aler:alertOnAirRequest/aircrat-tail-number" />
			</aircraft-tail-number>
			<incident-date>
				<xsl:value-of select="//aler:alertOnAirRequest/date" />
			</incident-date>
		</security-incidents>
	</xsl:template>
</xsl:stylesheet>
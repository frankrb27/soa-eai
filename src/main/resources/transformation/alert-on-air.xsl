<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:tns="http://aerolineas-latinoamericanas/contract/messages"
	version="2.0" exclude-result-prefixes="#default tns">
	<xsl:template match="/">
		<security-incidents>
			<level>
				<xsl:value-of select="//tns:domain-events-info/tns:alert-on-air/tns:alert-type" />
			</level>
			<description>
				<xsl:value-of
					select="//tns:domain-events-info/tns:alert-on-air/tns:description" />
			</description>
			<flight-external-key>
				<xsl:value-of select="//@external-key" />
			</flight-external-key>
			<aircraft-tail-number>
				<xsl:value-of select="//tns:tail-number/@external-key" />
			</aircraft-tail-number>
			<incident-date>
				<xsl:value-of select="current-time()" />
			</incident-date>
		</security-incidents>
	</xsl:template>
</xsl:stylesheet>
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="2.0">
  
    <xsl:template match="/" >
            <xsl:for-each-group select="/autok/auto" group-by="tulaj/varos/text()">
                          <p><xsl:value-of select="current-grouping-key()"/></p>
                          <p><xsl:value-of select="count( current-group())"/></p>
                          <p><xsl:value-of select="sum( current-group()/ar)"/></p>                 
            </xsl:for-each-group>
    </xsl:template>
</xsl:stylesheet>
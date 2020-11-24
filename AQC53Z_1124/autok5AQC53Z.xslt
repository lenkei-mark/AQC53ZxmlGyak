  <?xml version="1.0" encoding="UTF-8"?>
  <xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  version="2.0" xmlns:kl="kl.xml">
  
    <xsl:template match="/" >
         <xsl:for-each-group select="//auto" group-by="tipus/text()">
            <p><xsl:sort select="count( current-group())"/></p>
            <p><xsl:value-of select="current-grouping-key()"/></p>
            <p><xsl:value-of select="count( current-group())"/></p>
         </xsl:for-each-group>
    </xsl:template>

</xsl:stylesheet>
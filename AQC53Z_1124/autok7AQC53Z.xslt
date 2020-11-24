  <?xml version="1.0" encoding="UTF-8"?>
  <xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
   version="1.0">
  
     <xsl:template match="/"  >
        <xsl:for-each select="/autok/auto">
            <xsl:sort select="ar"/>
                <p><xsl:value-of select="@rsz"/></p>
                <p><xsl:copy-of select="ar"/></p>
        </xsl:for-each>
    </xsl:template>
  
  </xsl:stylesheet>

<?xml version="1.0" encoding="UTF-8"?>
  <xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
   version="2.0">
  
     <xsl:template match="/" >
         <p>elemdb=<xsl:value-of  select="count(/autok/*)"/></p>
     </xsl:template>

  </xsl:stylesheet>
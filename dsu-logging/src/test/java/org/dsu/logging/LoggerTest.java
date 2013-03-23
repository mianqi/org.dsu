package org.dsu.logging;
import junit.framework.Assert;

import org.dsu.logging.DSULogger;
import org.dsu.logging.DSULoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LoggerTest{
	
	@Test
	public void testDSULogger(){
		DSULogger logger = DSULoggerFactory.getInstance().getLogger(LoggerTest.class);
		logger.debug("TEST");
		logger.info("TEST");
		logger.warn("TEST");
		logger.error("TEST");
		logger.fatal("TEST");
		DSULoggerFactory.setConfig("test.properties");
		logger.debug("TEST");
		logger.info("TEST");
		logger.warn("TEST");
		logger.error("TEST");
		logger.fatal("TEST");
		Assert.assertNotNull(logger);
	}
}

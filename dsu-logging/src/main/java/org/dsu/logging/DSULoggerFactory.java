package org.dsu.logging;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.PropertyConfigurator;

public class DSULoggerFactory {

	private static final String DCONF = "default.properties";

	private static String lastConf = "";
	private static DSULoggerFactory INSTANCE = null;

	private DSULoggerFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void setConfig(String conf) {
		if (!StringUtils.isBlank(conf) && !StringUtils.equals(lastConf, conf)) {
			lastConf = conf;
			PropertyConfigurator.configure(INSTANCE.getClass().getClassLoader()
					.getResourceAsStream(lastConf));
		}
	}

	public static DSULoggerFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DSULoggerFactory();
			lastConf = (StringUtils.isBlank(lastConf)) ? DCONF : lastConf;
			PropertyConfigurator.configure(INSTANCE.getClass().getClassLoader()
					.getResourceAsStream(lastConf));
		}

		return INSTANCE;
	}

	public DSULogger getLogger(String name) {
		return new DSULogger(name);
	}

	public DSULogger getLogger(Class<?> cls) {
		return new DSULogger(cls);
	}

}

package org.dsu.logging;

import org.apache.log4j.Logger;

public class DSULogger {

	private Logger worker;

	protected DSULogger(String name) {
		// TODO Auto-generated constructor stub
		worker = Logger.getLogger(name);
	}

	protected DSULogger(Class<?> cls) {
		// TODO Auto-generated constructor stub
		worker = Logger.getLogger(cls);
	}

	public void debug(Object message) {
		// TODO Auto-generated method stub
		worker.debug(message);
	}

	public void debug(Object message, Throwable t) {
		// TODO Auto-generated method stub
		worker.debug(message, t);
	}

	public void error(Object message) {
		// TODO Auto-generated method stub
		worker.error(message);
	}

	public void error(Object message, Throwable t) {
		// TODO Auto-generated method stub
		worker.error(message, t);
	}

	public void fatal(Object message) {
		// TODO Auto-generated method stub
		worker.fatal(message);
	}

	public void fatal(Object message, Throwable t) {
		// TODO Auto-generated method stub
		worker.fatal(message, t);
	}

	public void info(Object message) {
		// TODO Auto-generated method stub
		worker.info(message);
	}

	public void info(Object message, Throwable t) {
		// TODO Auto-generated method stub
		worker.info(message, t);
	}

	public void warn(Object message) {
		// TODO Auto-generated method stub
		worker.warn(message);
	}

	public void warn(Object message, Throwable t) {
		// TODO Auto-generated method stub
		worker.warn(message, t);
	}

}

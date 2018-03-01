package com.example.demo;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//use this class only if embedded server is tomcat
//@ConditionalOnClass(Tomcat.class)
public class LogTomCat {
	private static Log logger=LogFactory.getLog(LogTomCat.class);
	//user defined method - execute after constructing this class object
	@PostConstruct
	public void logInfo()
	{
		logger.info("\n\n\n Server is starting :\n\n\n");
		
	}
}

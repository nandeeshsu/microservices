package com.example.demo;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat;
//use this class only if embedded server is tomcat
@ConditionalOnClass(Tomcat.class)
public class LogTomCat {
	private static Log logger=LogFactory.getLog(LogTomCat.class);
	//user defined method - execute after constructing this class object
	@PostConstruct
	public void logTomcatVersion()
	{
		logger.info("\n\n\n Tomcat Version : "+Tomcat.class.getPackage().getImplementationVersion()+"\n\n\n");

	}
}

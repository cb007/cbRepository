package com.scope.banking.aspects;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggingAspect {
	private final static Logger logger = Logger.getLogger(LoggingAspect .class.getName()); 
	
   public LoggingAspect() throws SecurityException, IOException
   {
	   FileHandler fh = new FileHandler("D:\\workspace\\cb\\spring-hibernate\\AspectDemo\\MyLogFile.log");
		 logger.addHandler(fh);

   }
	@Before("execution(* com.scope.banking.entities.Flight.getCapacity(..))")
	public void flightLogBefore(JoinPoint joinPoint) {

		System.out.println("Flight Name logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	
	
	@After("execution(* com.scope.banking.entities.Flight.getCapacity(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("Flight Name logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}
	
	@AfterThrowing( pointcut="execution(* com.scope.banking.entities.Flight.setCapacity(..))", throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Throwable exception) throws Throwable
	{ 
		logger.info("Inside CatchThrowException.afterThrowing() method...");
		logger.info("Running after throwing exception..."); 
		logger.info("Exception : " + exception); 
	} 
}


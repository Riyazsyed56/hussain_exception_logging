package com.hussain.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	 private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    SimpleInterest si=new SimpleInterest(1000,1,10f);
    LOGGER.debug("Simple Interest: "+si.getSimpleInterest());
    LOGGER.debug("Compound Interes "+si.getCompoundInterest());
    BuildingCost b1=new BuildingCost("standard",50,false);
    BuildingCost b2=new BuildingCost("above standard",50,false);
    BuildingCost b3=new BuildingCost("high standard",50,false);
    BuildingCost b4=new BuildingCost("high standard",50,true);
    
    LOGGER.debug("Building cost :"+b1.getConstructionCost()+"\n");
    LOGGER.debug("Building cost :"+b2.getConstructionCost()+"\n");
    LOGGER.debug("Building cost :"+b3.getConstructionCost()+"\n");
    LOGGER.debug("Building cost :"+b4.getConstructionCost()+"\n");
    }
}

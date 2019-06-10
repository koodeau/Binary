/*
package com.koodeau;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.*;

public class Manager {

 private static final Logger logger = LoggerFactory.getLogger(Manager.class);

 public boolean processTask(Task task) {
  logger.debug("processTask id="+task.getId());
  try {
   task.start();
   task.progress();
   task.complete();
   return true;
  } catch(Exception e) {
   logger.error("Unknown error", e);
   return false;
  }
 }

 public static void main (String[] args){

 }
}
*/
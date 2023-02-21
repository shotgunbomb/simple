package com.listeners;

import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class CustomHttpSessionListener implements HttpSessionListener{


  public void sessionCreated(HttpSessionEvent sessionEvent){
   //print timestamp & session & getMaxInactiveInterval
   // use date.toString() for the time
      HttpSession session = sessionEvent.getSession();
      Date date = new Date();
      System.out.println(">>> Created Session: ["+session.getId() +"] at ["+ date.toString()+"] <<<");
      Thread.dumpStack();

  }
  public void sessionDestroyed(HttpSessionEvent sessionEvent){
   // print timestamp & sessionId at the point it is destroyed
   // use date.toString() for the time
      HttpSession session = sessionEvent.getSession();
      Date date = new Date();
      System.out.println(">>> Destroyed Session: ["+session.getId() +"] at ["+ date.toString()+"] <<<");
      Thread.dumpStack();
  }
}

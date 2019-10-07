package com.demo.HibernateCheck;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   UserDetails userDetails;
	
	@Before
	public void setup(){
		 userDetails = new UserDetails();
		 userDetails.setUserId(1);
		 userDetails.setUserName("Alok");
	}
	
    @Test
    public void getUserIdTest() {
      userDetails.getUserId();
    }
    
    @Test
    public void getUserNameTest(){
    	userDetails.getUserName();
    }
}

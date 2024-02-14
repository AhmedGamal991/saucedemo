Feature: New Subscription
				 Description : As a user I want to subscribe to a specific feature,
				 							 to reach the login screen.
  			 
  Background:
  					  Given  The user has an android device, he has installed the app,
   					  And    he is connected to the Internet via Wi-Fi 
					    And		 The User opened
										 Account from the bottom navigation bar  
							And		 The user navigated to User Profile to New Subscription			 

  Scenario Outline:	 New Subscription With valid credentials <First Name> & <Last Name> & <Mobile> & <Email>
  					  Given  The user has valid data <First Name> with no spaces and no special charcters 
  					 				 and the number of letters is between 5 and 15 letters.
 					    When   he entered <First Name>, <Last Name>, <Mobile>, <Email>, <Birthdate>, <Address>, 
 					    			 and <Gender>
              Then   The user has subscribed successfully

  Examples: 
    | First Name | Last Name | Mobile | Email | Birthdate | Address | Gender |
    | Areeb | Company | 01000013865 | test@gmail.com | 2-2-2002 | Egypt-Cairo | Famale |
    | Ahmed | gamal | 0100000022 | test2@gmail.com | null | null | null |
   
   
   
  Scenario Outline:	 New Subscription With invalid credentials <First Name> & <Last Name> & <Mobile> & <Email>
  					  Given  The user has invalid data <First Name> with NO spaces and no special charcters 
  					  But	   the number of letters is less than 5 letters
 					    When   he wrote <First Name>, <Last Name>, <Mobile>, <Email>, <Birthdate>, <Address> 
 					    			 and <Gender>.
              Then   The message will apear : the user name must be at least 5 letters. 

  Examples: 
    | First Name | Last Name | Mobile | Email | Birthdate | Address | Gender |
    | Are | Company | 01000013865 | test4@gmail.com | 2-2-2002 | Egypt-Giza | Male |
    | abcd | gamal | 0100000022 | test3@gmail.com | null | null | null |   
    
    
    
    
  Scenario: Valid scenario   : The user completed the form without 
  												     birthday, address, and gender fields
  					
  Scenario: Invalid scenario : The user has invalid data 'First Name' using spaces or special charcters 
  				  									 but the number of letters is between 5 and 15 letters.
  					
  Scenario: Invalid scenario : The user has valid data 'First Name' with no spaces and no special charcters 
  				 										 but the number of letters is less than 5 letters.
  				  
  Scenario: Invalid scenario : The user entered valid data but he missed mandatory field 
  													 	 such as First Name, Last Name, Mobile, or email. 	
  													 	 
  													 	 
  													 	 			  
    
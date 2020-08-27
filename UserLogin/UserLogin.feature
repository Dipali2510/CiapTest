Feature:User Login

Login a registered user

     
        Scenario Outline:  Successful Login of a registered user
        Given User is on the Login Page        
        When he enters his username as <username>        
        And he enters his password        
        And he is successfully authenticated through ldap        
        Then he must be logged in and taken to the homepage        
        
        
        Examples:
            | username |
            |     mick |                
            
            
    
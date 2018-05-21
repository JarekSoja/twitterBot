# twitterBot
Simple Twitter bot written in Java, using SpringBoot with Hibernate. 

>Used libraries:

-Twitter4J to communicate with Twitter,

-JWiki to communicate with MediaWiki,

>Available options:

- sending tweet: random String generated with UUID class concatenated with current time,
- sending link to random entry in english Wikipedia,

>Configuration:
- setting delay in sending first message,
- setting interval,

>Login credentials:

To pass your login info just create file login.txt in resources directory. File should look like this:

 OAuthConsumerKey=xxxxxxxxxxxxx
 
 OAuthConsumerSecret=xxxxxxxxxxxxxxxxxxxxxxxxx
 
 OAuthAccessToken=xxxxxxxxxxxxxxxxxxxxxxx
 
 OAuthAccessTokenSecret=xxxxxxxxxxxxxxxxxxxxxxxxxxxxx


>To do:
- recieving data from Twitter (saved in database) and creating tweets with those data, eg. most popular tweets sent 
in particular country in last 24 hours,
- sending weather forecast (downloaded from external API) for given region/s.



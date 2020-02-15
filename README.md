# Micronoaut 
- modern jvm based full stack framwrok
- use to build easy testable microservices
- developer by creator of Grals frwamework.

benifits:
* LEss time to strt you app as compare to spring boot app
* Easy Testing- write TC fro user, and can be directly tested on embedded server.
* it run on embedded netty server
* Reduce memory footprint , as IOC ofSpringboot uses a lot of memory for managing bean life cyle (it uses Reflection, constructors..)
* for mack brew install micronaut thats it.
Basic command:
-mn --version
> . mn create-applicaiton "aapnmae" --build maven ( if u dont give build it will used gradle.)
* once the app is created ,you can import it in any idea intellij/eclipse,...
* to create bean /controleer/job, ..from command prompt go inside the app directory:
 Commands:
    - help                     Prints help information for a specific command
        - create-bean              Creates a singleton bean
        - create-test              Creates a simple test for the project's testing framework
        - create-job               Creates a job with scheduled method
        - create-repository        Creates a repository and associated test
        - create-websocket-client  Creates a Websocket client
        - create-client            Creates a client interface
        - create-controller        Creates a controller and associated test
        - create-websocket-server  Creates a Websocket server
  
  
  If comapre with spring booth 
 #### Starttime
     * Micronaut: 1264milli sec
     * spring-bbot ">2 sec
     
 ** also if you comapre the memroy footprint on jvisual vm of both you cna find a lot of diff, in above eg 
     micronaou was using 10 mb , ans spring bbot 178 mb
     
  
  

# Akka requests

A simple experiment to see how many request can a AKKA cluster handle.

Step 1 - Compile the code
```
sbt compile
```

Step 2 - Start tcp server
```
sbt run
```
Select option 2 to start the server

Step 3 - Start ClientApp
Usage: sbt "run <host> <port> <number of connections> <sleep time between requests>"
Example:
```
sbt "run localhost 2020 4000 0"
```



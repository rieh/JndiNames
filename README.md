# JndiNames

In BPM on Cloud we don't have BPM DB access directly. They hide BPM DB
JNDI Name. And also it is not writing JNDI name while the server is starting.
But there is another way to get JNDI name of the BPM on-Cloud Database.
If you execute the code below in BPM on Cloud environment, It will write all the JNDI names to log which are defined in WAS.
So you can directly access to BPM DB which is NOT recommend.

- Download this code
- Make it JAR file
- Execute this JAR file in IBM BPM as a Service Flow
- Check SystemOut.log file to find the all JNDI names.

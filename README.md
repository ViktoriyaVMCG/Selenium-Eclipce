# Selenium-Eclipce
To work with Selenium & Eclipce on the computer we need 3 things to install:
* Java JDK https://www.oracle.com/java/technologies/javase-downloads.html
* Eclipse JEE https://www.eclipse.org/downloads/ `After launching choose JEE package`
* Selenium https://www.selenium.dev/downloads/ `Last stable version`

1. After downloading JAVA 
  * Go to the Settings -> System -> Edit the system environment variables
  * Choose the environment variables
  * Find in the pop-up window: *System variables following* inside it *Path* click on it and then click on edit. 
  * In the new pop-up window paste at the end of the file a new path that should include the location the bin file in the java folder and click save
     *  *Example `C:\Program Files\Java\jdk-14.0.1\bin`* 
  * After that call cm
  * Type the following to find out if Java was successfully installed
    *   `java -version`
  * If java successfully installed we will see a response of java version  
2. After installing Eclipse no action is required till we install Selenium
3. After installing Selenium
  * Create a folder that name Selenium in the C: folder
  * Place into that folder the downloaded Selenium which will be called `selenium-server-standalone`
  * Dowload Selenium for java https://www.selenium.dev/downloads/
  * Unzip the downloaded folder into Selenium folder. Inside the Selenium folder shoould be the following:
    * selenium-java folder
    * selenium-server-standalone.jar
  * Inside the selenium-java folder should be the following:
    * 1(one) folder lib
    * 2(two) jar files
    * 3 files
  * Downloading ChromeDriver - WebDriver for Chrome https://www.selenium.dev/downloads/ and scroll down till Browser section or https://sites.google.com/a/chromium.org/chromedriver/
    * Downloading the current stable version
  * After downloading it placing the folder inside the Selenium\selenium-java folder and unzip it there.
  * Inside a new folder should be file chromedriver.exe
4. Launch Eclipse to make a new project, little bit of configuration and to check if everything was installed and downloaded properly.
  * File -> New -> Java project (`if there you can't find a java project go to  Window -> Perspective -> Open Perspective -> Java Project ` After this java project will appear under New)
  * In the folder scr that appears in the new project create the package
  * Inside the package create a class
  **Configuration part**
  * On the left bar find the JRE System Library
  * Right click -> Build Path -> Configure Build Path
  * In a open new window find Classpath and click on it -> Click on the Add External Jars
  * After that add the following files into the Classpath:
    * That locates into folders: `libs inside of the selenium-java`
    * byte-buddy
    * commons-exec
    * guava
    * okhttp
    * okio
    * That locates into folders: `selenium-java`
    * client-combined
    * client-combined-sources
  
  

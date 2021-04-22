# Selenium-WebDriver-Examples

Java Selenium WebDriver script examples using Maven and Testng,
Make sure to use my POM file that include all the needed Dependencies

Quick setup:
1) Download the rar file and extract it on your pc prefered location
2) From IntelliJ, import the project as maven project, wait for all dependencies and plugins to download (as determined in pom.xml)
3) Open Maven Lifecycle and run Maven clean-validate-compile
   verify for all BUILD SUCCESS status is returned
4) Open folder src - main - java - any tests folder e.g. 'capturescreenshot'
5) Right click on the file - Run or open the file and choose spacific test to run

If an error is shown:
java.lang.IllegalStateException: The driver executable does not exist: C:\Appium Jars and Drivers\Selenium\chromedriver.exe
then go to https://chromedriver.chromium.org/downloads
Download the version depending on the chrome version you use.
7) Download and extract the driver, then give the path to the driver e.g.

        // Setting the webdriver.chrome.driver property to its executable's location
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
...



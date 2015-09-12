# Mobile-testing
To test the mobile application using APPIUM

## PREREQUISITES

1.Before running automated tests you must install JDK 1.6 (or higher) (not JRE).
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
and set the path in environment variables to  location of JDK

2.Android SDK and APIs for recent versions of Android
https://developer.android.com/sdk/index.html
and set the environment variables in system to location of 
SDK->tools 
and one more with 
SDK->platform_tools
To make sure that android is setup type ”android” at the command prompt and a SDk manager will come up

3.install and setup Nodejs from:
https://nodejs.org/en/

4.install Eclipse  
http://www.eclipse.org/downloads/
and install the ADT plugin 

####To add the ADT plugin to Eclipse:
a.Start Eclipse, then select Help > Install New Software.
b.Click Add, in the top-right corner.
c.In the Add Repository dialog that appears, enter "ADT Plugin" for the Name and the following URL for the Location:
https://dl-ssl.google.com/android/eclipse/
d.Click OK.
e.In the Available Software dialog, select the checkbox next to Developer Tools and click Next.
f.In the next window, you'll see a list of the tools to be downloaded. Click Next.
g.Read and accept the license agreements, then click Finish.
h.If you get a security warning saying that the authenticity or validity of the software can't be established, click OK.
i.When the installation completes, restart Eclipse.

5.You will also need to install the selenium-java client. It can be found under the "Selenium Client & WebDriver Language Bindings" section at 
 http://www.seleniumhq.org/download/
 Download and unzip the selenum-java client.

6.Download Appium for Windows zip archive and extract all files in a folder called Appium
https://bitbucket.org/appium/appium.app/downloads/

## TO RUN APPIUM SERVER
1.	Go to the Appium folder you downloaded earlier and run Appium.exe.
2.	Click on Launch Appium Node Server.

## TO FIND ELEMENTS IN A NATIVE APP
1.	Go to SDK folder and open the tools folder.
2.	Open uiautomatorviewer.On the actual device, open the app to the page you want to automate.
3.	In UI Automator Viewer, click on Device screenshot (second button).
4.	Click any element on the page and look in the Node detail window (there you will find details about the selected element: id, class, name, etc.)
5.	Use the info found (id, class) in Eclipse to click buttons, fill input fields

7.  Create a project and add the all the jars to the project by 
Right-click the project-> Build Path->Configure Build Path-> Add External JARs->browse and add the JARs->ok

@echo off
rem Run script to launch the farmerbuddy application safely with memory constraints.
set CLASSPATH="build\classes;C:\Users\yashj\Downloads\mysql-connector-java-8.0.28.jar;C:\Users\yashj\Downloads\rs2xml.jar;C:\Users\yashj\OneDrive\Desktop\jsp-api-2.0.jar;C:\Users\yashj\OneDrive\Desktop\servlet-api.jar;C:\Users\yashj\OneDrive\Desktop\commons-logging-1.2.jar;C:\Users\yashj\OneDrive\Desktop\jstl-1.2.jar"

echo Launching FarmMarket...
"C:\Program Files\Java\jdk-20\bin\java.exe" -Xmx256m -cp %CLASSPATH% farmerbuddy.Splash

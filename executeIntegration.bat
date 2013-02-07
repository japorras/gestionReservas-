SET _test=%PATH%
ECHO %_test%
SET _endbit=C:\Program Files\Java\j2re1.4.2_07\bin
CALL SET PATH=%%_test:%_endbit%=%%D:\software\java\jdk_1.6\bin; 
SET JAVA_HOME=D:\software\java\jdk_1.6

FOR /F "eol=; tokens=2,2 delims==" %%i IN ('findstr /i "workspace" variables_gr.properties') DO set workspace=%%i
echo %workspace%
echo %JBOSS_HOME%
setLocal
start call %JBOSS_HOME%\bin\runServer.bat
IF NOT EXIST %workspace%\salidaIntegracion GOTO CREATEDIRECTORY ELSE GOTO DELETEFILE




:CREATEDIRECTORY
mkdir %workspace%\salidaIntegracion	
GOTO EXECUTE

:DELETEFILE
del %workspace%\salidaIntegracion\*.log
GOTO EXECUTE


:EXECUTE
start /min cmd cd %workspace% 
call mvn clean install > %workspace%\salidaIntegracion\buildproject.log
call mvn jboss-as:deploy > %workspace%\salidaIntegracion\deployEAR.log
call mvn jboss-as:undeploy > %workspace%\salidaIntegracion\undeployEAR.log
%JBOSS_HOME%/bin/jboss-admin.bat --connect command=:shutdown



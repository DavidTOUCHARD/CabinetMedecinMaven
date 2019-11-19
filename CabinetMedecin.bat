@echo on

SET mypath=%~dp0
SET tomcatpath=C:\Users\Khady NDIAYE\Documents\SETUP\apache-tomcat-9.0.19\apache-tomcat-9.0.19

call mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/DavidTOUCHARD/CabinetMedecinMaven.git -DcheckoutDirectory=CabinetMedecin

cd %mypath%\CabinetMedecin\CabinetMedecin\


call mvn clean package

SET src=C:\Users\Khady NDIAYE\Documents\ENSUP\M2IT\GTM\MAVEN_SCM\CabinetMedecin\CabinetMedecin\CabinetMedecin-presentation\target\CabinetMedecin-presentation.war
SET dest=C:\Users\Khady NDIAYE\Documents\SETUP\apache-tomcat-9.0.19\apache-tomcat-9.0.19\webapps

copy %src% %dest%

cd %tomcatpath%

call startup.sh

start chrome http://localhost:8080/CabinetMedecin-presentation/

pause



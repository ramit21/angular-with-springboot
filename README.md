# angular-with-springboot
Render Angular app via springboot

artefacts: 

ui: parent project

angular: angular project

web: Java 

Parent pom has 

<packaging>pom</packaging> //saying that it does not contain source code

<modules> //will be build the child projects in this order

Child projects:

angular // contains angular code. The pom of this peoject just runs npm build. Don't use spring-boot-maven-plugin in angular project as there is no java code here to compile. Using the frontend-maven-plugin, build is performed on the angular code.



web // ....





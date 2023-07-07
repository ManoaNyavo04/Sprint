cd framework/WEB-INF/classes/   
jar cf Framework.jar ./*
move Framework.jar ../../../TestFramework/WEB-INF/lib/
cd ../../../
cd TestFramework/WEB-INF/classes/ 
javac  -cp ../lib/Framework.jar -d . *.java 
cd ../../../
cd TestFramework/
jar cvf TestFramework.war ./*
move TestFramework.war ../../../
pause
@echo off
SETLOCAL ENABLEDELAYEDEXPANSION

SET JAVA_OPTS=-Xmx512m
SET CP=bin
FOR %%f IN (lib\*.jar) DO SET CP=!CP!;%%f

java -cp "%CP%" Console %*

ENDLOCAL

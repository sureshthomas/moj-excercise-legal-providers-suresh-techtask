# Find a Legal Adviser API
## Problem description
This provide a RESTful API to find a legal aid adviser 
## Assumptions
* It is a public API for demo only<br/>
* No authorisation and authentication<br/>
* This should be completed in an hour
    * Paging not added
    * No caching at the API(RESTFUl) level. Although the data is cached


## Compatibility

## JDK/JRE
The App has been compiled by a more recent version of the Java Runtime (class file version 55.0).
JDK 12 is used for the project 
## Gradle
The built is with Gradle . The version used is 4.10.2


## Build the jar

### Gradle

A gradle task is configure in **build.gradle**
To build using gradle <br/>

`gradlew bootJar`

## Running

By default , the application looks for legal-providers.csv in the path. Ideally it should
be specified with _--db_ argument at the rultime

`gradlew bootRun --args='--db=legal-providers.csv'` <br/>
Alternatively this can  be run<br/>
`java -jar moj-excercise-legal-providers.jar --db=legal-providers.csv`

## Notes
* Gradle _buildscan_ is configured to report any build or run issues

## Executing APIs

## Filter legal legaladvisers based on condition

The following are possible

crime,debt,housing,immigrationorasylum,welfarebenefits

## Examples
#### Find by ID
http://localhost:8080/legaladviser/1
### Find all 
http://localhost:8080/legaladvisers
### Filer based on condition
#### Method 1, each wih categories spec
1. http://localhost:8080/legaladvisers?categories=CriMe&categories=Debt
#### Method 2, coma delimited
2. http://localhost:8080/legaladvisers?categories=CriMe,Debt
3. http://localhost:8080/legaladvisers?categories=crime,debt,immigrationorasylum,immigrationorasylum
4. http://localhost:8080/legaladvisers?categories=crime,debt,housing,immigrationorasylum,welfarebenefits  => This return nothing




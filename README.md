# CA-java-homework-Streams

This java project will do the following:
* Generate 1000 random grades
* Print out the min, max, and average grade
* Print out the number of students that received each letter grade (A, B, C, D, F)
* Print out the number of students that recevied a prefect 100

## Installation

The jar file was built using openjdk version "17.0.1" 2021-10-19

## Usage

To run jar file navigate to the project folder using a terminal and use the following command to run the jar file
```bash
java -jar Streams.jar
```

If you receive the following error:
```bash
java.lang.UnsupportedClassVersionError: Preview features are not enabled for App (class file version 61.65535). Try running with '--enable-preview'
```

please use the following command:
```bash
java -jar --enable-preview Streams.jar
```

## Example output

```bash
Min: 44
Max: 100
Average: 85.343
Letter Grade A: 338 Students 
Letter Grade B: 453 Students 
Letter Grade C: 154 Students 
Letter Grade D: 46 Students  
Letter Grade F: 9 Students   
22 Students got a perfect 100
```

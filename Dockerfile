FROM openjdk:8
COPY ./target/CalculatorSPE-DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp" , "CalculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]

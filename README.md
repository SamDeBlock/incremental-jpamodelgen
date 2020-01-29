# Sample project for HHH-13390
See https://hibernate.atlassian.net/browse/HHH-13390

## Usage
Toggle comments for annotationProcessors in build.gradle to switch between unpatched and patched JPAMetaModelEntityProcessor.
Run gradle as
```
gradlew --info compileJava
```
1. Run compileJava and observe output
2. Change some code
3. Run compileJava and observe output

Repeat above 3 steps for each annotationProcessor.

The following message should not be present when using the patched annotationProcessor _Full recompilation is required because org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor is not incremental._ 
# Linkage Error caused by a exclusion


## How to run

```
$ mvn clean install
...
[INFO] Reactor Summary for linkage-error-by-exclusion 1.0-SNAPSHOT:
[INFO] 
[INFO] linkage-error-by-exclusion ......................... SUCCESS [  0.455 s]
[INFO] c .................................................. SUCCESS [  1.450 s]
[INFO] b .................................................. SUCCESS [  0.107 s]
[INFO] a .................................................. SUCCESS [  0.320 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
```


```
$ cd a
$ mvn exec:java
...

[INFO] --- exec-maven-plugin:3.0.0:java (default-cli) @ a ---
Hello from A!
Hello from B
[WARNING] 
java.lang.NoClassDefFoundError: org/example/c/C
    at org.example.b.B.main (B.java:33)
    at org.example.a.A.main (A.java:33)
    at org.codehaus.mojo.exec.ExecJavaMojo$1.run (ExecJavaMojo.java:254)
    at java.lang.Thread.run (Thread.java:748)
Caused by: java.lang.ClassNotFoundException: org.example.c.C
    at java.net.URLClassLoader.findClass (URLClassLoader.java:382)
    at java.lang.ClassLoader.loadClass (ClassLoader.java:424)
    at java.lang.ClassLoader.loadClass (ClassLoader.java:357)
    at org.example.b.B.main (B.java:33)
    at org.example.a.A.main (A.java:33)
    at org.codehaus.mojo.exec.ExecJavaMojo$1.run (ExecJavaMojo.java:254)
    at java.lang.Thread.run (Thread.java:748)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```

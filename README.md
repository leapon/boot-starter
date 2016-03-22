# boot-starter

A starter project for clojure project using Boot

# usage

```
$ boot test
Testing bootstart.core
Testing bootstart.core-test
Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

$ boot run
Hello, bootstart

$ boot build
Compiling 1/1 bootstart.core...
Writing pom.xml and pom.properties...
Adding uberjar entries...
Writing bootstart-0.1.0-SNAPSHOT-standalone.jar...
Writing target dir(s)...

$ java -jar target/bootstart-0.1.0-SNAPSHOT-standalone.jar 
Hello, bootstart
```

Reference: https://github.com/seancorfield/boot-new

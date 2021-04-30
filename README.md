To run:

```
clj -m cljs.main --target node --output-to main.js -c cljs-test-issue.core
node main.js
```

This is to showcase there is an

```
Execution error (StackOverflowError) at java.net.URLStreamHandler/parseURL (URLStreamHandler.java:312).
```

when there are more than 21 `cljs.test` tests in the shown async+go block pattern.
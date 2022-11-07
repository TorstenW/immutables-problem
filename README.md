To reproduce the error build the project using jdk version 17. It works with version 11.

```shell
./gradlew clean build
```

The import for `ImmutableTestId` is present in `SomeTest.java` but it is missing in the generated `ImmutableSomeTest.java`.

```
> Task :compileJava FAILED
/Users/torsten.weidmann.ext/Development/java/immutables-problem/build/generated/sources/annotationProcessor/java/main/org/example/ImmutableSomeTest.java:18: error: cannot find symbol
  private final ImmutableTestId testId;
                ^
  symbol:   class ImmutableTestId
  location: class ImmutableSomeTest
/Users/torsten.weidmann.ext/Development/java/immutables-problem/build/generated/sources/annotationProcessor/java/main/org/example/ImmutableSomeTest.java:20: error: cannot find symbol
  private ImmutableSomeTest(ImmutableTestId testId) {
                            ^
  symbol:   class ImmutableTestId
  location: class ImmutableSomeTest
/Users/torsten.weidmann.ext/Development/java/immutables-problem/build/generated/sources/annotationProcessor/java/main/org/example/ImmutableSomeTest.java:28: error: cannot find symbol
  public ImmutableTestId getTestId() {
         ^
  symbol:   class ImmutableTestId
  location: class ImmutableSomeTest
/Users/torsten.weidmann.ext/Development/java/immutables-problem/build/generated/sources/annotationProcessor/java/main/org/example/ImmutableSomeTest.java:38: error: cannot find symbol
  public final ImmutableSomeTest withTestId(ImmutableTestId value) {
                                            ^
  symbol:   class ImmutableTestId
  location: class ImmutableSomeTest
/Users/torsten.weidmann.ext/Development/java/immutables-problem/build/generated/sources/annotationProcessor/java/main/org/example/ImmutableSomeTest.java:122: error: cannot find symbol
    private ImmutableTestId testId;
            ^
  symbol:   class ImmutableTestId
  location: class Builder
/Users/torsten.weidmann.ext/Development/java/immutables-problem/build/generated/sources/annotationProcessor/java/main/org/example/ImmutableSomeTest.java:145: error: cannot find symbol
    public final Builder testId(ImmutableTestId testId) {
                                ^
  symbol:   class ImmutableTestId
  location: class Builder
6 errors

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 617ms
2 actionable tasks: 2 executed
```
# DiagrammedAssertionsMacro.assert

Diagrams assert fails with Scala 3.0.0, while it works with Scala 2.13.6.

```
sbt +test
```

Then you'll see the logs like:

```
sbt:scala3-scalatest> +Test/compile
[info] Setting Scala version to 2.13.6 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3-scalatest (in build file:/home/taisukeoe/workspace/Sandbox/scala3-scalatest/)
[info] compiling 1 Scala source to /home/taisukeoe/workspace/Sandbox/scala3-scalatest/target/scala-2.13/test-classes ...
[success] Total time: 1 s, completed Jun 2, 2021 9:44:38 PM
[info] Setting Scala version to 3.0.0 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3-scalatest (in build file:/home/taisukeoe/workspace/Sandbox/scala3-scalatest/)
[info] compiling 1 Scala source to /home/taisukeoe/workspace/Sandbox/scala3-scalatest/target/scala-3.0.0/test-classes ...
[error] -- [E007] Type Mismatch Error: /home/taisukeoe/workspace/Sandbox/scala3-scalatest/src/test/scala/DiagramTest.scala:7:4 
[error] 7 |    assert(Seq("a", "b") == Seq("a"))
[error]   |    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
[error]   |    Found:    String*
[error]   |    Required: String
[error]   |
[error]   |    The following import might make progress towards fixing the problem:
[error]   |
[error]   |      import org.scalactic.Prettifier.default
[error]   |
[error]   | This location contains code that was inlined from DiagramTest.scala:9
[error] -- [E007] Type Mismatch Error: /home/taisukeoe/workspace/Sandbox/scala3-scalatest/src/test/scala/DiagramTest.scala:7:4 
[error] 7 |    assert(Seq("a", "b") == Seq("a"))
[error]   |    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
[error]   |    Found:    (11 : Int)
[error]   |    Required: String
[error]   |
[error]   |    The following import might make progress towards fixing the problem:
[error]   |
[error]   |      import org.scalactic.Prettifier.default
[error]   |
[error]   | This location contains code that was inlined from DiagramTest.scala:9
[error] two errors found
[error] two errors found
[error] (Test / compileIncremental) Compilation failed
[error] Total time: 6 s, completed Jun 2, 2021 9:44:44 PM
```
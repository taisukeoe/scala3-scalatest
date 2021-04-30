# DiagrammedAssertionsMacro.assert


```
sbt +test
```

Then you'll see:

```
sbt:scala3-scalatest> +test
[info] Setting Scala version to 2.13.5 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3-scalatest (in build file: .../scala3-scalatest/)
[info] compiling 1 Scala source to .../scala3-scalatest/target/scala-2.13/test-classes ...
[info] DiagramTest:
[info] - this should be success
[info] Run completed in 108 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed Apr 30, 2021 4:56:50 PM
[info] Setting Scala version to 3.0.0-RC3 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3-scalatest (in build file:/home/taisukeoe/workspace/Sandbox/scala3-scalatest/)
[info] compiling 1 Scala source to /home/taisukeoe/workspace/Sandbox/scala3-scalatest/target/scala-3.0.0-RC3/test-classes ...
[error] -- Error: dotty/diagrams/src/main/scala/org/scalatest/diagrams/Diagrams.scala:182:7 
[error] undefined: org.scalatest.DiagrammedAssertionsMacro.assert # -1: TermRef(TermRef(TermRef(ThisType(TypeRef(NoPrefix,module class org)),object scalatest),DiagrammedAssertionsMacro),assert) at sbt-api
[error] -- Error: dotty/diagrams/src/main/scala/org/scalatest/diagrams/Diagrams.scala:204:7 
[error] undefined: org.scalatest.DiagrammedAssertionsMacro.assert # -1: TermRef(TermRef(TermRef(ThisType(TypeRef(NoPrefix,module class org)),object scalatest),DiagrammedAssertionsMacro),assert) at sbt-api
[error] -- Error: dotty/diagrams/src/main/scala/org/scalatest/diagrams/Diagrams.scala:225:7 
[error] undefined: org.scalatest.DiagrammedAssertionsMacro.assume # -1: TermRef(TermRef(TermRef(ThisType(TypeRef(NoPrefix,module class org)),object scalatest),DiagrammedAssertionsMacro),assume) at sbt-api
[error] -- Error: dotty/diagrams/src/main/scala/org/scalatest/diagrams/Diagrams.scala:247:7 
[error] undefined: org.scalatest.DiagrammedAssertionsMacro.assume # -1: TermRef(TermRef(TermRef(ThisType(TypeRef(NoPrefix,module class org)),object scalatest),DiagrammedAssertionsMacro),assume) at sbt-api
[error] four errors found
[error] four errors found
[error] (Test / compileIncremental) Compilation failed
[error] Total time: 0 s, completed Apr 30, 2021 4:56:51 PM
```
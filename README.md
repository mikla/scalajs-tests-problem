Simple ScalaJS project to reproduce problem with running tests.

macOS Sierra 10.12.1

PhantomJS 2.1.1
```
java -version
java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)
```
 
`sbt`

`test`
 
```
java.util.concurrent.TimeoutException: Futures timed out after [4909838365 nanoseconds]
	at scala.concurrent.impl.Promise$DefaultPromise.ready(Promise.scala:219)
	at scala.concurrent.impl.Promise$DefaultPromise.result(Promise.scala:223)
	at scala.concurrent.Await$$anonfun$result$1.apply(package.scala:107)
	at scala.concurrent.BlockContext$DefaultBlockContext$.blockOn(BlockContext.scala:53)
	at scala.concurrent.Await$.result(package.scala:107)
	at org.scalajs.jsenv.AsyncJSRunner$class.await(AsyncJSRunner.scala:59)
	at org.scalajs.jsenv.ExternalJSEnv$AsyncExtRunner.await(ExternalJSEnv.scala:160)
	at org.scalajs.jsenv.AsyncJSRunner$class.awaitOrStop(AsyncJSRunner.scala:76)
	at org.scalajs.jsenv.ExternalJSEnv$AsyncExtRunner.awaitOrStop(ExternalJSEnv.scala:160)
	at org.scalajs.testadapter.ScalaJSRunner$$anonfun$1.apply$mcV$sp(ScalaJSRunner.scala:97)
	at org.scalajs.testadapter.ScalaJSRunner$$anonfun$1.apply(ScalaJSRunner.scala:97)
	at org.scalajs.testadapter.ScalaJSRunner$$anonfun$1.apply(ScalaJSRunner.scala:97)
	at scala.util.Try$.apply(Try.scala:161)
	at org.scalajs.testadapter.ScalaJSRunner.done(ScalaJSRunner.scala:97)
	at sbt.Defaults$$anonfun$allTestGroupsTask$1$$anonfun$16.apply(Defaults.scala:590)
	at sbt.Defaults$$anonfun$allTestGroupsTask$1$$anonfun$16.apply(Defaults.scala:588)
	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:244)
	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:244)
	at scala.collection.immutable.Map$Map1.foreach(Map.scala:109)
	at scala.collection.TraversableLike$class.map(TraversableLike.scala:244)
	at scala.collection.AbstractTraversable.map(Traversable.scala:105)
	at sbt.Defaults$$anonfun$allTestGroupsTask$1.apply(Defaults.scala:588)
	at sbt.Defaults$$anonfun$allTestGroupsTask$1.apply(Defaults.scala:586)
	at scala.Function1$$anonfun$compose$1.apply(Function1.scala:47)
	at sbt.$tilde$greater$$anonfun$$u2219$1.apply(TypeFunctions.scala:40)
	at sbt.std.Transform$$anon$4.work(System.scala:63)
	at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:228)
	at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:228)
	at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:17)
	at sbt.Execute.work(Execute.scala:237)
	at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:228)
	at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:228)
	at sbt.ConcurrentRestrictions$$anon$4$$anonfun$1.apply(ConcurrentRestrictions.scala:159)
	at sbt.CompletionService$$anon$2.call(CompletionService.scala:28)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
[error] (sharedJS/test:executeTests) java.util.concurrent.TimeoutException: Futures timed out after [4909838365 nanoseconds]
```

import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "hello-play-java"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Select Play modules
    //jdbc,      // The JDBC connection pool and the play.api.db API
    //javaJdbc,  // Java database API
    //javaEbean, // Java Ebean plugin
    //javaJpa,   // Java JPA plugin
    javaCore,  // The core Java API
    
    // WebJars pull in client-side web libraries
    "org.webjars" %% "webjars-play" % "2.1.0-3",
    "org.webjars" % "bootstrap" % "2.3.1",
  
    // Add your own project dependencies in the form:
    // "group" % "artifact" % "version"
    
        // temporary workaround to run the Java tests
    "play" %% "play-test" % play.core.PlayVersion.current % "test" exclude("com.novocode", "junit-interface"),
    "com.novocode" % "junit-interface" % "0.9" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}

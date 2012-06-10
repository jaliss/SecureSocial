import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "ss2demo-scala"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )
 
    val secureSocial = PlayProject(
    	appName + "-securesocial2", appVersion, appDependencies, mainLang = SCALA, path = file("modules/securesocial")
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    ).dependsOn(secureSocial).aggregate(secureSocial)

}

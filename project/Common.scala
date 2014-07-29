import sbt._
import Keys._

object Common {
  def version = "master-SNAPSHOT"
  def playVersion = System.getProperty("play.version", "2.3.2")
  def scalaVersion =  System.getProperty("scala.version", "2.11.2")
}

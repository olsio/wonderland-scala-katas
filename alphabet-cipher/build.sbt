import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "1.0.0-SNAPSHOT"
ThisBuild / organization := "wonderland"
ThisBuild / organizationName := "wonderland"

lazy val root = (project in file("."))
  .settings(
    name := "alphabet-cipher",
    libraryDependencies += scalaTest % Test
  )
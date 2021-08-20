name := "Delphi"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("com.silver.delphi")
organization := "com.silver"

githubOwner := "Jtrim777"
githubRepository := "Delphi"

//resolvers += "My GitHub Repo" at "https://maven.pkg.github.com/Jtrim777/gamelib/"

libraryDependencies += "com.silver" %% "gamelib" % "0.1"
// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % System.getProperty("play.version", "2.4.2"))

// Add Scalariform
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")

// PGP signing
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

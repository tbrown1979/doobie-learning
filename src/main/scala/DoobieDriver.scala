package doobie.example

import scalaz._, Scalaz._
import scalaz.effect.{ SafeApp, IO }
import scalaz.stream.Process
import scalaz.concurrent.Task

import doobie.imports._
import doobie.contrib.h2.h2transactor._

trait DoobieProfile {
  val db: Transactor[Task]
}

trait H2DoobieProfile extends DoobieProfile {
  val db = H2Transactor[Task]("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa", "").run
}

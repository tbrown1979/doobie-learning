package doobie.example

import scalaz._, Scalaz._
import scalaz.effect.{ SafeApp, IO }
import scalaz.stream.Process
import scalaz.concurrent.Task

import doobie.util.transactor._
import doobie.imports._


object Main extends App with DoobieCoffeeRepositoryComponent with H2DoobieProfile {

  coffeeRepository.create.transact(db).run
  coffeeRepository.insertSuppliers(List(Supplier(101, "Acme, Inc.", "99 Market Street", "Groundsville", "CA", "95199"))).transact(db).run
  coffeeRepository.insertCoffees(List(Coffee("Colombian", 101, 7.99, 0, 0))).transact(db).run

  val testCoffee = coffeeRepository.get(101).run
  println(testCoffee)
}

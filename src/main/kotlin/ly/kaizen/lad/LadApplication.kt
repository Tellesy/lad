package ly.kaizen.lad

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LadApplication

fun main(args: Array<String>) {
    runApplication<LadApplication>(*args)
    //Test
    println("Welcome to LAD")
    println("Made by Kaizen Corporation")
    println("All rights reserved by Kaizen Corporation and Master Muhammad Tellesy")
    println("This is a test")
}

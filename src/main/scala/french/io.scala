import java.io._

object Test {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt" ))

      writer.write("Hello Scala")
      writer.close()
   }
}

object Test {
   def main(args: Array[String]) {
      print("Please enter your input : " )
      val line = Console.readLine
      
      println("Thanks, you just typed: " + line)
   }
}


import scala.io.Source

object Test {
   def main(args: Array[String]) {
      println("Following is the content read:" )

      Source.fromFile("test.txt" ).foreach{ 
         print 
      }
   }
}

import scala.io.Source
 
val filename = "fileopen.scala"
for (line <- Source.fromFile(filename).getLines()) {
  println(line)
}

val fileContents = Source.fromFile(filename).getLines.mkString
val fileLines = io.Source.fromFile("Colors.scala").getLines.toList
fileLines.foreach(println)
import scala.io.Source
import java.io.{FileReader, FileNotFoundException, IOException}
 
val filename = "no-such-file.scala"
try {
for (line <- Source.fromFile(filename).getLines()) {
  println(line)
}
} catch {
  case ex: FileNotFoundException => println("Couldn't find that file.")
  case ex: IOException => println("Had an IOException trying to read that file")
}



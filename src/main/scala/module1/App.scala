package module1
import scala.util.control.Breaks._



object App {

  def main(args: Array[String]): Unit = {

   //  val two = (x: Int) => { return x; 2 }
    def sumItUp: Int = {
      def one(x: Int): Int = { return x; 1 }
      
      val two = (x: Int) => { return x; 2 }
      
      1 + two(7) + one(2) 
    }

    println(sumItUp)
      
    println("hello world")

  }


}









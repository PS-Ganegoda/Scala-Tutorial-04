

object question2{
     def getinput():Int={
         println("Enter the integer:");
        val input=scala.io.StdIn.readInt();
        input
        }
     def patternmatching(input:Int):String= input match{
      case 0=> "Zero"
      case n if n<0 =>"Negative value"
      case n if n % 2 == 0 => "Even"
      case n if n % 2 != 0 => "Odd"
    
           }
        

g      def main(args:Array[String]):Unit={
          val input= getinput();
          val result=patternmatching(input);
          println(result);

    }
}-
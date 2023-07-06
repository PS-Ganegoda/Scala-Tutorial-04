object Question1{
def depositmoney():Double={
    println("Enter the deposit amount:");
    val deposit=scala.io.StdIn.readDouble();2000
    deposit;
}

def calinterest(deposit:Double):Double={
   val interest=if(deposit <20000)
  {
    deposit*0.02
  }
  else if(deposit <200000)
  {
    deposit*0.04
  }
 else  if(deposit <2000000)
  {
      deposit*0.035
  }
  else 
  {
        deposit*0.065
  }
    interest;
 
}
 

def totalmoney(deposit:Double,interest:Double):Unit={

println("The deposit: "+deposit);
println("The interest:  "+interest);
println("Total     :"+(deposit + interest));
}



def main(args:Array[String]):Unit={
val deposit=depositmoney();
val interest=calinterest(deposit);
totalmoney(deposit,interest);
}
}
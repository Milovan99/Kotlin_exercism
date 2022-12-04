class Squares (private val broj:Int){


    fun sumOfSquares() : Int{
        val brojevi2= arrayListOf<Int>()
        for(i in 1..broj){
            brojevi2.add(i)
        }
        var suma = 0
        for (i in brojevi2.indices){
            suma+=brojevi2[i]*brojevi2[i]
        }
        return suma
    }

    fun squareOfSum() :Int{
       val brojevi= arrayListOf<Int>()
       for(i in 1..broj){
           brojevi.add(i)
       }
        var rezultat=0
        var drugiDeo=0
        for (i in brojevi.indices){

           for(j in brojevi.indices){
               if (j+1 > i && brojevi.indices.contains(j+1)){
                   drugiDeo += 2*brojevi[i]*brojevi[j+1]
               }
           }
            if (brojevi.indices.contains(i+1)){
                drugiDeo+=brojevi[i+1]*brojevi[i+1]
            }
        }
        rezultat+=brojevi.first()*brojevi.first()+drugiDeo
        return rezultat
    }

    fun difference() :Int{
        return squareOfSum() - sumOfSquares()
    }
}

fun main(){
    val matematika=Squares(broj = 3)
    println(matematika.squareOfSum())
}







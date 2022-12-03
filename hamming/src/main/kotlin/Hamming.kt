object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length !=rightStrand.length){
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        if(leftStrand.isEmpty()){return 0}else{
            val listaA = leftStrand.toCharArray()
            val listaB = rightStrand.toCharArray()
            var brojac = 0
            for (i in listaA.indices) {
                if (listaA[i] != listaB[i]) {
                    brojac++
                }
            }
            return brojac
        }
    }
}

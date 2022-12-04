class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
        var noviRed= matrixAsString.split('\n').toList()
        var kolona= mutableListOf<Int>()
        for(i in noviRed.indices){
            var rezultat=noviRed[i]
            var rezultatInt =rezultat.split(' ').map { it.toInt() }
             kolona.add(rezultatInt[colNr-1])
        }
        return kolona
    }

    fun row(rowNr: Int): List<Int> {
       var noviRed= matrixAsString.split('\n').toList()
        var rezultat=noviRed[rowNr-1]
        var rezultatInt =rezultat.split(' ').map { it.toInt() }
        return rezultatInt
    }
}

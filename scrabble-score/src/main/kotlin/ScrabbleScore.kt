object ScrabbleScore {

    var brojac :Int=0


    fun scoreLetter(c: Char): Int {
        when(c){
            'A','a','E','e','I','i','O','o','U','u','L','l','N','n','R','r','S','s','T','t'-> brojac+=1
            'D','d','G','g'->brojac+=2
            'B','b','C','c','M','m','P','p'-> brojac+=3
            'F','f','H','h','V','v','W','w','Y','y'-> brojac+=4
            'K','k'-> brojac+=5
            'j','J','X','x'-> brojac+=8
            'q','Q','z','Z'-> brojac+=10

            else-> brojac+=0
        }
        return brojac
    }

    fun scoreWord(word: String): Int {
var rec = word.toCharArray()
        brojac=0
        for (i in rec.indices){
            brojac=scoreLetter(rec[i])
        }
        return brojac

    }
}
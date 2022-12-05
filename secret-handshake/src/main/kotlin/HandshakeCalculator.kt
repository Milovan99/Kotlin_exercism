val SECRET_CODES = linkedMapOf<Int, (List<Signal>) -> List<Signal>>(
    0b1     to { l -> l + Signal.WINK },                // Wink
    0b10    to { l -> l + Signal.DOUBLE_BLINK },        // Double Blink
    0b100   to { l -> l + Signal.CLOSE_YOUR_EYES },     // Close Your Eyes
    0b1000  to { l -> l + Signal.JUMP },                // Jump
    0b10000 to { l -> l.reversed() }                    // Reverse
)
object HandshakeCalculator {
    fun calculateHandshake(instructions: Int): List<Signal> =
        SECRET_CODES.filter         { instructions and it.key !== 0 }
            .map            { it.value }
            .fold(listOf()) { signals, action -> action(signals) }
}
fun main(){
    var rukovanje = HandshakeCalculator
    println(rukovanje.calculateHandshake(19))
}
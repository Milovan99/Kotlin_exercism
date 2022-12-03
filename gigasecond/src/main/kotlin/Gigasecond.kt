import java.time.LocalDate
import java.time.LocalDateTime


class Gigasecond( date: Any) {

    val date: LocalDateTime = when(date){is LocalDateTime -> date.plusSeconds(1000000000)
        is LocalDate->date.atTime(0,0,0).plusSeconds(1000000000)
        else -> throw Exception()
    }


}

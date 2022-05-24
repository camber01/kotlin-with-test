package structural.adapter

import java.time.LocalDateTime

fun main(){
    var rawSMS = RawSMS()

    var promoProcessing : PromoProcessing = PromoAdapter(rawSMS)
    promoProcessing.registerPromo()
}
package structural.adapter

import java.sql.Timestamp
import java.time.LocalDateTime

class RawSMS() {
    var transactionID:String? = ""
    var timestamp:String? = ""
    var message:String? = ""
    var shortcode:String? = ""
    var recipient:String? = ""
    var sender:String? = ""
}
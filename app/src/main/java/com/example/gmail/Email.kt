import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Email(
    val sender: String,
    val title: String,
    val summary: String,
    val timestamp: String = SimpleDateFormat("MM/dd/yyyy hh:mm", Locale.US).format(Date())) {
}
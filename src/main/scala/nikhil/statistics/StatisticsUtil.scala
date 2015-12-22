package nikhil.statistics

/**
 * @author Nikhil
 */
object StatisticsUtil {
  def round(number: Double, scale: Int = 2): Double = BigDecimal(number).setScale(scale, BigDecimal.RoundingMode.HALF_UP).toDouble
}

package smile.math.distance

/**
 * @author Beck Gaël
 * Utilitary used in some binary distance measure essentially to build the contingency table
 **/
object BinaryUtils {

	/**
	 * Buil the contingency matrix (a, b, c, d) where for each bite i, j of vector 1 and 2 :
	 *   - a is incremented if i = 1, j = 1
	 *   - b is incremented if i = 1, j = 0
	 *   - c is incremented if i = 0, j = 1
	 *   - d is incremented if i = 0, j = 0
	 **/
	def contingencyTable(vector1: Array[Int], vector2: Array[Int]) = {

	  val oneByte = 1
	  val zeroByte = 0

	  var i = 0
	  var (a,b,c,d) = (0, 0, 0, 0)
	  while( i < vector1.size ) {
	  	
	    if( vector1(i) == oneByte ) {
	    	if( vector2(i) == oneByte ) a += 1
	    	else b += 1
	    }
	    else if( vector2(i) == zeroByte ) d += 1
	    else c += 1

	    i += 1
	  }
	  (a, b, c, d)
	}

	/**
	 * Count number of occurence for each binary features
	 * @return Array[(numberOf0, numberOf1)]
	 **/
	def countOccFeat(data: Array[Array[Int]]): Array[(Int, Int)] = {
		val nbTotData = data.size
		val nbOne = data.map(_.map(_.toInt)).reduce( _.zip(_).map( x => x._1 + x._2) )
		val nbZero = nbOne.map(nbTotData - _)
		nbZero.zip(nbOne)
	}
}
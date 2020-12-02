package LinearSVM.java
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    val getData = new DataHandling()
    var testData: Array[Array[Float]] = getData.getTestData()
    var trainData : Array[Array[Float]] = getData.getTrainData()

    println(testData.mkString(" "))
  }

}

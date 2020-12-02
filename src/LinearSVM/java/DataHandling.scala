package LinearSVM.java

// Create Training and Test Datasets
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.util.Random

class DataHandling
{
        val fileName = "beer_processed.txt"
        val fSource = Source.fromFile(fileName)

        var dataArray = new ArrayBuffer[Array[Float]]()

        for(line<-fSource.getLines()) {
            dataArray += line.split("\t").map(_.toFloat)
        }
        fSource.close()

        var numSamp = dataArray.length
        var numTrainData = (numSamp*.6667).toInt
        var numTestData = numSamp - (numSamp*.6667).toInt

        var testDataArrays  =    new Array[Array[Array[Float]]](10)
        var trainDataArrays =    new Array[Array[Array[Float]]](10)
        var testDataArr     =    new Array[Array[Float]](numTestData)
        var trainDataArr = new Array[Array[Float]](numTrainData)

            Random.shuffle(dataArray)
            dataArray.copyToArray(trainDataArr,0,numTrainData)
            dataArray.copyToArray(testDataArr,0,numTestData)

    def getTestData(): Array[Array[Float]] = {
        return this.testDataArr
    }

    def getTrainData(): Array[Array[Float]] =  {
        return this.trainDataArr
    }
}

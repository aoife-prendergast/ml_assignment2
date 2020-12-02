// Create Training and Test Datasets
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.util.Random


object DataHandling
{
    def main(args: Array[String]): Unit = {
        val fileName = "beer_processed.txt"
        val fSource = Source.fromFile(fileName)

        val dataArray = new ArrayBuffer[Array[Float]]()

        for(line<-fSource.getLines()) {
            dataArray += line.split("\t").map(_.toFloat)
        }
        fSource.close()
        dataArray.foreach(x=>x.foreach(println))
        
    }





    //
//        //beerData.foreach(println)
//
//        for(dataEl <- beerData){
//            beerDataFormatted += dataEl
//        }
//
//        beerDataFormatted.foreach(println)

//        for(el <- beerDataFormatted)
//            println(el.mkString(","))
//
//        val numSamp = beerDataFormatted.length
//        val numTrainData = numSamp*(2/3)
//        val numTestData = numSamp*(1/3)
//        val shuffledData = Random.shuffle(beerDataFormatted)
//
//        val trainData = new ArrayBuffer[Array[Float]](numTrainData)
//        val testData = new ArrayBuffer[Array[Float]](numTestData)
//
//        for(num <- 0 to numTrainData){
//            trainData += shuffledData[num]
//        }
//        Random.shuffle(beerData)
//        val i = 0
//        for(el <- trainData) {
//            i++
//            println("NUM : " + i + " - "+ el.mkString(","))
//
//        }

}

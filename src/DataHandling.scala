// File handling program
import java.io.File
import java.io.PrintWriter
object DataHandling
{
    // Main method
    def main(args:Array[String]) {
      // Creating a file
      val file_Object = new File("beer.txt")

      // Passing reference of file to the printwriter
      val print_Writer = new PrintWriter(file_Object)

      // Writing to the file
      print_Writer.write("Hello, This is Geeks For Geeks")

      // Closing printwriter
      print_Writer.close()
    }
}

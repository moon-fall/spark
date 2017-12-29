import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * Created by Administrator on 2017/12/26.
  */
object test {
  def main(args: Array[String]) {
    val defaultMaxSplitBytes = 128
    val openCostInBytes = 1
    val defaultParallelism = 40

    println(s"defaultParallelism: $defaultParallelism")

    //val files=(1 to 100).toArray
    val files=(1 to 16500).toArray.map(x => 3)

    val totalBytes = files.map(_ + openCostInBytes).sum
    println(s"totalBytes: $totalBytes ")
    val bytesPerCore = totalBytes / defaultParallelism
    println(s"bytesPerCore: $bytesPerCore ")
    val maxSplitBytes = Math.min(defaultMaxSplitBytes, Math.max(openCostInBytes, bytesPerCore))
    println(s"Planning scan with bin packing, max size: $maxSplitBytes bytes, " +
      s"open cost is considered as scanning $openCostInBytes bytes. \n")

    files.sortBy( {x:Int => x})(implicitly[Ordering[Int]].reverse)

    val partitions = new ArrayBuffer[ArrayBuffer[Int]]()
    var currentPartitionSplits = new ArrayBuffer[Int]
    var currentSize = 0L

    def closePartition(): Unit = {
      if (currentPartitionSplits.nonEmpty) {
        partitions += currentPartitionSplits
      }
      currentPartitionSplits = new ArrayBuffer[Int]
      currentSize = 0
    }

    files.foreach { split =>
      if (currentSize + split > maxSplitBytes) {
        closePartition()
      }
      // Add the given file to the current partition.
      currentSize += split + openCostInBytes
      currentPartitionSplits += split
    }
    closePartition()

    println("partitions.size: "+ partitions.size  )

    partitions.map(partition => println(partition.toArray.mkString(",")))

    //print(partitions.map(_.toString()))

    //partitions.map(println(_.    asInstanceOf[Array].mkString(","))
  }
}

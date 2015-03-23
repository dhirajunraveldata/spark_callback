package loader

import org.apache.spark.{TaskContext, Partition}

/**
 * Created by dhiraj on 3/20/15.
 */
class UnravelDataSparkCallBack {

  def callBackRdd(split:Partition, context:TaskContext):Unit = {
    println("  this is split "+split+"  and local is context"+context)
  }

}

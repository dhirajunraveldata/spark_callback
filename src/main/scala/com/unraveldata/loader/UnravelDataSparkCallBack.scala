package com.unraveldata.loader

import org.apache.spark.{Partition, TaskContext}

/**
 * Created by dhiraj on 3/20/15.
 */
class UnravelDataSparkCallBack {

  def callBackRdd(split:Partition, context:TaskContext):Unit = {
    println("  this is split "+split+"  and local is context"+context)
  }

}

package leetcode

object TwoSum {
  def main(args: Array[String]): Unit = {
    val ret = twoSum(Array(3, 2, 4), 6)
    println(ret(0))
    println(ret(1))
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = scala.collection.mutable.Map[Int,Int]()
    for (i <- nums.indices) {
      val x = target - nums(i)
      map.get(x) match {
        case Some(e) => return Array[Int](e, i)
        case None => map.put(nums(i), i)
      }
    }
    // Not Found
    return Array[Int](-1,-1)
  }
}

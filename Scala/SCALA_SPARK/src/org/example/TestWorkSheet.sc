import scala.collection.mutable.ArrayBuffer

// var
val a:Int = 10

var b:Int = 20
b = 30

if ( a > 0) {
  1
} else {
  "error"
}
// z 被赋值为 unit，相当于 null
val z = if(a < 1){
  1
}else{
  var c = "test"

}
print(z)

val nums = 1 to 10
for(eachItem <- nums){
  println(eachItem)
}

// 函数表达式
def add4(num:Int*)=num.sum

add4(19, 20,30)

// 函数表达式，不适用 def
val add5 = (x:Int, y:Int) => x+y

// 匿名函数及其调用?有问题暂时没有解决掉匿名函数调用
(x:Int, y:Int) => x + y


// 定长数组
var arr = Array("hadoop", "hive", "spark")

// 不定长数组
var b = Array[Int]()


//for(i <- 0 <= to < arr.length){
//  println(arr[i])
//}

for(eachItem <- arr){
  println(eachItem)
}

// 不可变map
val map1 = Map("k1"->20, "k2"->39)

println(map1("k1"))
map1("k2")

import scala.collection.mutable.Map
val map2 = Map("k1" -> 40, "k5"->12)
map2("k5") = 60
map2("k2") = 23

for (key <- map2.keySet){
  println(map2(key))
}

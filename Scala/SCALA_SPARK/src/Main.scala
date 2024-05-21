package org.example

import scala.util.Random
import scala.Int
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkContext}
import org.apache.spark.rdd.{RDD}
import org.apache.spark.sql.functions._


object Main {
  def main(args: Array[String]): Unit = {
    val sparkSession:SparkSession = SparkSession.builder()
      .appName("sparkDecmo")
      .master("local[*]")
      .getOrCreate()

//    val df:DataFrame = sparkSession.read.text("./resources/data.txt")
//    df.printSchema()
//
//    df.show()
//    sparkSession.stop()
    val sc:SparkContext = sparkSession.sparkContext
    sc.setLogLevel("WARN")

    var rdd: RDD[Array[String]] = sc.textFile("./resources/data.txt")
      .map(x => x.split(" "))


    val personRdd: RDD[Person] = rdd.map(x => Person(x(0).toInt, x(1), x(2).toInt, x(3), x(4), x(5).toInt))


    import sparkSession.implicits._
    val df:DataFrame = personRdd.toDF()

//    df.printSchema()
//
//    df.show()
    print("全量数据: ")
    println(df.count())

    print("一共有多少个小于20岁的人参加考试: ")
    println(df.filter($"age" < 20).count())

    print("一共有多少个等于20岁的人参加考试: ")

     println(df.filter($"age" === 20).count())
//    df.createTempView("person")
//    print(sparkSession.sql("select count(1) FROM person where age = 20").show())
    print("一共有多少个大于20岁的人参加考试: ")
    println(df.filter($"age" > 20).count())

    print("一共有多个男生参加考试: ")
    println(df.filter($"agender" === "男").count())

    print("一共有多少个女生参加考试: ")
    println(df.filter($"agender" === "女").count())


    print("12班有多少人参加考试: ")
    println(df.filter($"classRoom" === 12).count())

    print("13班有多少人参加考试: ")
    println(df.filter($"classRoom" === 13).count())

    print("语文科目的平均成绩是多少: ")
    println(df.filter($"course" === "chinese").select(avg($"score")).first()(0))

    print("数学科目的平均成绩是多少: ")
    println(df.filter($"course" === "math").select(avg($"score")).first()(0))

    print("英语科目的平均成绩是多少: ")
    println(df.filter($"course" === "english").select(avg($"score")).first()(0))

    print("每个人平均成绩是多少: \n")
    println(df.groupBy($"name").agg(avg($"score").as("avgScore")).show())

    print("12班平均成绩是多少: ")
    println(df.filter($"classRoom" === 12).select(avg($"score")).first()(0))

    print("12班男生平均总成绩是多少: ")
    println(df.filter($"classRoom" === 12).filter($"agender" === "男").select(avg($"score")).first()(0))

    print("12班女生平均总成绩是多少: ")
    println(df.filter($"classRoom" === 12).filter($"agender" === "女").select(avg($"score")).first()(0))

    print("13班平均成绩是多少: ")
    println(df.filter($"classRoom" === 13).select(avg($"score")).first()(0))

    print("13班男生平均总成绩是多少: ")
    println(df.filter($"classRoom" === 13).filter($"agender" === "男").select(avg($"score")).first()(0))

    print("13班女生平均总成绩是多少: ")
    println(df.filter($"classRoom" === 13).filter($"agender" === "女").select(avg($"score")).first()(0))

    print("全校语文成绩最高分是多少: ")
    println(df.filter($"course" === "chinese").select(max($"score")).first()(0))

    print("12班语文成绩最低分是多少: ")
    println(df.filter($"course" === "chinese").filter($"classRoom" === 12).select(min($"score")).first()(0))

    print("13班数学最高成绩是多少: ")
    println(df.filter($"course" === "math").filter($"classRoom" === 13).select(max($"score")).first()(0))

    print("总成绩大于150分的12班的女生有几个: ")
    println(df.filter($"classRoom" === 12).filter($"agender" === "女").groupBy($"name").agg(sum($"score").as("totalScore")).filter(col("totalScore" )> 150).count())

    print("总成绩大于150分，且数学大于等于70，且年龄大于等于19岁的学生的平均成绩是多少: ")
    val students:DataFrame = df.filter($"age" >= 19)
    // 总成绩大于 150
    val temp1: DataFrame = students.groupBy($"name").agg(sum($"score").as("totalScore")).filter(col("totalScore") > 150)
    // 数据大于等于 70
    val temp2: DataFrame = students.filter($"course" === "math").filter($"score" >= 70).select($"name".alias("baseName"))
    val names:DataFrame = temp2.join(temp1, temp1("name")===temp2("baseName"), "inner").select(col("baseName"), col("totalScore"))

    println(students.join(names, names("baseName")===students("name"), "inner").select(avg($"score")).first()(0))
//    students.join(names, names("baseName")===students("names"), "inner").select(avg($"score")).show()



    sc.stop()
    sparkSession.stop()
  }
}
//班级  姓名  年龄  性别  科目 成绩
//12 宋江 25 男 chinese 50
case class Person(classRoom:Int, name: String, age:Int, agender:String, course:String, score:Int)
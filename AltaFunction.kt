package com.example.studykt.ui.theme

fun main() {
    val resultSum = Calc(32, 67, ::sum)
    val resultMinus = Calc(147, 67, ::sum)
    val resultMult = Calc(43, 52, ::multiply)
    val resultDiv = Calc(100, 5, ::divide)
    println("A soma dos numeros eh: $resultSum")
    println("-------------")
    println("A subtracao dos numeros eh: $resultMinus")
    println("-------------")
    println("A multiplicacao dos numeros eh: $resultMult")
    println("-------------")
    println("A divisao dos numeros eh: $resultDiv")
}
fun Calc(numA: Int, numB: Int, operation:(Int, Int)-> Int): Int {
    return operation (numA, numB)
}
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun minus(a: Int, b: Int): Int {
    return a - b
}
fun multiply(a: Int, b: Int): Int {
    return a * b
}
fun divide(a: Int, b: Int): Int {
    return a / b
}
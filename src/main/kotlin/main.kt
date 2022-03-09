package ru.netology.kotlin021

import java.lang.Exception

fun main(){
    var amount: Int = 0
    var transferComission: Int = 0
    val comissionPerscent = 0.0075
    val minComission = 3500

    do{
        print("Введите сумму в рублях, целое число: ")

        val readUser = readLine()

        try{
            amount = readUser?.toInt()!! * 100
        }catch (e: Exception){
            println("Прошу ввести ЧИСЛО в рублях, целое число!")
            amount = 0
            continue
        }

        if(amount < 0){
            println("Прошу ввести число больше нуля!")
        }
    }while(amount <= 0)

    transferComission = (amount * comissionPerscent).toInt()
    transferComission = if(transferComission < minComission) minComission else transferComission

    println("Комиссия за перевод: $transferComission копеек.")
}
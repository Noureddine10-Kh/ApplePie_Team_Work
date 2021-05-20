package com.noureddine10kh.applepieteam.data


import com.noureddine10kh.applepieteam.data.domain.City

object DataManager {

     private val citiesList = mutableListOf<City>()
     private var cityIndex = 0

    fun addCity(city: City){
       citiesList.add(city)
    }

    fun getNextCity() :City{
      cityIndex++
        if (cityIndex== citiesList.size){
           cityIndex = 0
        }
        return citiesList[cityIndex]
    }

    fun getPreviousCity(): City{
       cityIndex--
        if (cityIndex==-1){
           cityIndex = citiesList.size-1
        }
        return citiesList[cityIndex]
    }
}
package com.noureddine10kh.applepieteam.data


import com.noureddine10kh.applepieteam.data.domain.City

object DataManager {

     private val citiesList = mutableListOf<City>()
     var popCitiesFilter = mutableListOf<Pair<String,Double>>()
     val countryNameList =  mutableListOf<String>()
     fun filteredCiTiesName(countryNameValue: String) :MutableList<Pair<String,Double>> {
      citiesList.filter {
           it.countryName==countryNameValue
           popCitiesFilter.addAll()
      }
         return
    }
    fun addCity(city: City){
       citiesList.add(city)
    }

    fun addCountryName(value :String){
        countryNameList.add(value)
    }

}



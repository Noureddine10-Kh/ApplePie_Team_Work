package com.noureddine10kh.applepieteam.util

import com.noureddine10kh.applepieteam.data.domain.City

class CsvParser {
    /**
     * this fun take a line from Csv file and parse it into city object
     * @param line a line from WorldCities Csv file
     * @return an instance of city with info parsed from the line
     */
    fun parse(line: String): City{
        val tokens = line.split(",")
        return City(
            cityName = tokens[Constant.ColumnIndex.CITY_INDEX],
            countryName = tokens[Constant.ColumnIndex.COUNTRY_INDEX],
            population =  tokens[Constant.ColumnIndex.POPULATION_INDEX].toDouble()
        )
    }
}
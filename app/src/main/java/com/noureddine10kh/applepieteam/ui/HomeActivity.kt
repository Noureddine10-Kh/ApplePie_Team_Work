package com.noureddine10kh.applepieteam.ui


import android.content.Intent
import android.view.LayoutInflater
import com.noureddine10kh.applepieteam.data.DataManager
import com.noureddine10kh.applepieteam.databinding.ActivityHomeBinding
import com.noureddine10kh.applepieteam.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding = ActivityHomeBinding::inflate
    override fun setup() {

    }

    override fun addCallBacks() {
           binding?.goInsideBtn?.setOnClickListener {
               val intent = Intent(this,SearchActivity::class.java)
               startActivity(intent)
       }
    }
    private fun parseFile(){
        val inputStream = assets.open("worldcities.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
            val currentCity = parser.parse(it)
            DataManager.addCity(currentCity)
        }
    }

}
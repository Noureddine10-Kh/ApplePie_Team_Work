package com.noureddine10kh.applepieteam.ui


import android.view.LayoutInflater
import android.widget.Toast
import com.noureddine10kh.applepieteam.data.DataManager
import com.noureddine10kh.applepieteam.data.domain.City
import com.noureddine10kh.applepieteam.databinding.ActivitySearchBinding


class SearchActivity :  BaseActivity<ActivitySearchBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySearchBinding = ActivitySearchBinding::inflate
    var filteredCountryName = mutableListOf<City>()

            override fun setup() {
    }

    override fun addCallBacks() {

        binding?.deleteBut?.setOnClickListener {
         var editCountryNameValue: String = binding?.editCountryName?.text.toString()
            when( editCountryNameValue.length) {
              in 2..125-> {
                 editCountryNameValue = editCountryNameValue.substring(0, editCountryNameValue.length - 1)
              }
               1 -> {
                 editCountryNameValue = ""
                 Toast.makeText(this,"please enter a letter for use this option again !!", Toast.LENGTH_LONG).show()
               }
            }
            binding?.editCountryName?.setText(editCountryNameValue)
         }
        ////////////////////////////////////////////////////////
        binding?.backBtn?.setOnClickListener {
            finish()
        }
        /////////////////////////////////////////////////////////
       binding?.showResultBtn?.setOnClickListener {
           var countryNameValue: String = binding?.editCountryName?.text.toString()
           check(countryNameValue)
        }
    }
    // the fun using : to check if the countryName is available or not
    private fun check (countryNameValue :String){
        if (countryNameValue.isNotEmpty()){
            if (countryNameValue[0] !in 'Z' downTo 'A'){
               Toast.makeText(this,"READ THE NOTE AND APPLY ITS RULES",Toast.LENGTH_LONG).show()
                binding?.editCountryName?.setText("")
            }else if(countryNameValue[0] in 'Z' downTo 'A' && countryNameValue.length>1){
                DataManager.countryNameList.forEach {
                    if (countryNameValue==it){
                         DataManager.filteredCiTiesName(countryNameValue)
                    }else{
                        Toast.makeText(this,"verified the country name \n and try again!!",Toast.LENGTH_LONG).show()
                        binding?.editCountryName?.setText("")
                    }
                }
            }
        }else{
            Toast.makeText(this,"You must enter a Country Name !!",Toast.LENGTH_LONG).show()
        }
    }

}


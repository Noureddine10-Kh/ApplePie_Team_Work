package com.noureddine10kh.applepieteam.ui

import android.view.LayoutInflater
import com.noureddine10kh.applepieteam.databinding.ActivityPieChartBinding

class PieChart: BaseActivity<ActivityPieChartBinding>(){
    override val bindingInflater: (LayoutInflater) -> ActivityPieChartBinding =ActivityPieChartBinding::inflate

    override fun setup() {
    }

    override fun addCallBacks() {
    }
}
package  com.components.carouselslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import  com.components.carouselslider.adapter.AdapterCarousel
import  com.components.carouselslider.dataProvider.DpData
import  com.components.carouselslider.databinding.ActivityMainBinding
import  com.components.carouselslider.extensions.ViewPagerExtensions.addCarouselEffect

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter by lazy { AdapterCarousel() }
    private val dpData by lazy { DpData() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViewPager()
    }

    private fun initViewPager() {
        binding.viewPager.addCarouselEffect()
        binding.viewPager.adapter = adapter
        adapter.submitList(dpData.dummyData)
    }
}
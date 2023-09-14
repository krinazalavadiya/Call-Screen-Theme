package com.example.callscreentheme

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.callscreentheme.databinding.ActivityLanguageSettingBinding
import com.kinnu.country.Adapter.CountryAdapter
import com.kinnu.country.ApiClient
import com.kinnu.country.ApiInterface
import com.kinnu.country.Model.ContryData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Locale

class LanguageActivitySetting : AppCompatActivity() {

    companion object {
        public lateinit var datalist:List<ContryData>
    }

    lateinit var binding: ActivityLanguageSettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLanguageSettingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial(binding)


    }


    fun initial(binding: ActivityLanguageSettingBinding) {

        var apiInterface = ApiClient.getApiclient().create(ApiInterface::class.java)
        apiInterface.getposts().enqueue(object : Callback<List<ContryData>> {
            override fun onResponse(
                call: Call<List<ContryData>>,
                response: Response<List<ContryData>>,
            ) {
                if (response.isSuccessful){

                    datalist = response.body()!!

                    this@LanguageActivitySetting.binding.countrylist.layoutManager = GridLayoutManager(applicationContext,1)
                    this@LanguageActivitySetting.binding.countrylist.adapter = CountryAdapter(datalist)


                } else {


                }
            }

            override fun onFailure(call: Call<List<ContryData>>, t: Throwable) {

            }
        })
    }

}


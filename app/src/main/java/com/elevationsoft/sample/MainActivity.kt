package com.elevationsoft.sample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.elevationsoft.vrclib.Vrc

class MainActivity : AppCompatActivity() {
    private var tvUrl: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.et_search)
        tvUrl = findViewById(R.id.tv_url)

        et.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                setSearchUrl(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

    }

    private fun setSearchUrl(searchQuery: String) {
        val url = "http://Example.com/android/api/abcd.php"
        val params: MutableMap<String, String> = HashMap()
        params["search"] = searchQuery
        val fullUrl: String = Vrc(url, params).getRequestedUrl()
        tvUrl?.text = fullUrl
    }
}
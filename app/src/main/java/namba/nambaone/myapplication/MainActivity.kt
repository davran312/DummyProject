package namba.nambaone.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import namba.wallet.nambaone.common.network.okhttp.OkHttpClientFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        OkHttpClientFactory.getInstance(OkHttpClientFactory.Type.SSE)
    }
}
package informationaesthetics.com.testappcrash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.polidea.rxandroidble.RxBleClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bleComm = RxBleClient.create(applicationContext)
    }
}



package id.codepresso.kotlinparcelizesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mengambil data dari parcelable sesuai parameter yang dikirimkan
        val dataUser = intent.getParcelableExtra<User>("data_user")

        // Binding ke View
        tvDetailUsername.text = dataUser.username
        tvDetailPassword.text = dataUser.password
    }
}

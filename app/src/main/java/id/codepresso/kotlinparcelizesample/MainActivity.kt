package id.codepresso.kotlinparcelizesample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            // data_username adalah parameter yang akan di tangkap oleh DetailActivity untuk menampilkan data User
            startActivity<DetailActivity>("data_user" to User(username, password))
        }
    }
}

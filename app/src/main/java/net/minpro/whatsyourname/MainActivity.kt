package net.minpro.whatsyourname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


//画面が開いた時に最初にやることを書く場所
    override fun onCreate(savedInstanceState: Bundle?) {
        //おまじない
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val textView : TextView = findViewById(R.id.textView)
       // val editText : EditText = findViewById(R.id.editTextTextPersonName)
       // val button : Button = findViewById(R.id.button)
       // val imageView : ImageView = findViewById(R.id.imageView)

    button.setOnClickListener(this)

    }

    //ボタンが押されたときにやることを書く場所
    override fun onClick(v: View?) {
        // 「●●」（入力した文字)さん、こんにちは」という文字を出す
        textView.text = editTextTextPersonName.text.toString() + "さん、こんにちは！"
        // 画像を出す
        imageView.setImageResource(R.drawable.kako)

    }
}

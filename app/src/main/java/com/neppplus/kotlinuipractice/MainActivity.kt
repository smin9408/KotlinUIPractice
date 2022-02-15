package com.neppplus.kotlinuipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼이 눌릴때 -> 입력된 메세지가 어떤건지 추출. -> 토스트로 띄워주기. + 텍스트뷰의 문구로 반영하기.

        btnOK.setOnClickListener {
//        버튼이 눌릴때 마다 실행
//            -> 입력된 내용은? 변수에 담아두자.

            val inputMessage = edtMessage.text.toString()
            // EditText의 문구(text)를 추출 -> String으로 변환까지.

            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

//            담겨있는 입력 문구를 -> 텍스트뷰의 text 속성의 값으로 대입.
            txtMessage.text = inputMessage // TextView의 text를 변경 : set


        }

    }
}
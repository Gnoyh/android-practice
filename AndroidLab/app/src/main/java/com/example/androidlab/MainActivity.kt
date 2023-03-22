package com.example.androidlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// AppCompatActivity를 상속받아 MainActivity 클래스를 정의
// AppCompatActivity는 Activity의 하위 클래스이므로 MainActivity는 액티비티 컴포넌트 클래스
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContentView() 함수 : 매개변수에 지정한 내용을 액티비티 화면에 출력 (activity_main.xml 파일의 내용을 화면에 출력)
        setContentView(R.layout.activity_main)
    }
}
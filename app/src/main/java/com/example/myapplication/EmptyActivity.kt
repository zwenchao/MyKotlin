package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

/**
 * Kotlin 的变量、函数和类型「练习题」
 * 1 - 使用 Android Studio 创建一个基于 Kotlin 的新项目（Empty Activity），添加一个新的属性（类型是非空的 View），在 onCreate 函数中初始化它。
 * 2 - 声明一个参数为 View? 类型的方法，传入刚才的 View 类型属性，并在该方法中打印出该 View? 的 id。
 */
class EmptyActivity : AppCompatActivity() {
    companion object {
        const val TAG = "BasicOneActivity"
    }

    private lateinit var mTvHomework: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTvHomework = findViewById(R.id.tvHomework)
        setBg(mTvHomework)
        test(mTvHomework)

//        test(imgLaunch)
    }

    private fun setBg(view: View?) {
        view?.setBackgroundColor(Color.YELLOW)
    }

    private fun test(view: View) {
        try {
            val textView = view as? TextView
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? 转换为 TextView，是否为空 = ${textView == null}")
        } catch (e: Exception) {
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? 转换为 TextView，转换出现异常 ${e}")
            e.printStackTrace()
        }
        try {
            val textView = view as TextView?
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as TextView? 转换为 TextView，是否为空 = ${textView == null}")
        } catch (e: Exception) {
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as TextView? 转换为 TextView，转换出现异常 ${e}")
            e.printStackTrace()
        }
        try {
            val textView = view as? TextView
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? TextView? 转换为 TextView，是否为空 = ${textView == null}")
        } catch (e: Exception) {
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? TextView? 转换为 TextView，转换出现异常 ${e}")
            e.printStackTrace()
        }
    }

    // 可以修改
    public override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }


}
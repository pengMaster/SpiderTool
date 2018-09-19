package king.bird.spidertool

import king.bird.spiderlib.bean.ImageResult
import king.bird.spiderlib.listener.ImageResultListener
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import king.bird.spiderlib.SpiderUtil
import king.bird.spiderlib.listener.ResultListener
import kotlinx.android.synthetic.main.activity_main.*


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "http://www.mzitu.com/tag/ugirls/"

        //获取指定网站所有图片
        mBtnImage.setOnClickListener {
            SpiderUtil.getImageByUrl(url, object : ImageResultListener {
                override fun result(imageList: HashSet<ImageResult>) {
                    mTvContent.text = imageList.toString()
                    imageList.forEach {
                        Log.e("getImageByUrl", it.toString())
                    }

                }
            })
        }

        //获取指定网站指定标签内属性
        mBtnTag.setOnClickListener {
            //标签
            val tag = "img"
            //要获取属性集合
            val attributeList = listOf<String>("data-original", "alt")
            SpiderUtil.getAttributeByTag(url, tag, attributeList, object : ResultListener {
                override fun result(list: HashSet<ArrayList<String>>) {
                    mTvContent.text = list.toString()
                    list.forEach {
                        Log.e("getAttributeByTag", it.toString())
                    }
                }

            })
        }

    }
}

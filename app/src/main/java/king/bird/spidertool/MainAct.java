package king.bird.spidertool;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

import king.bird.spiderlib.SpiderUtil;
import king.bird.spiderlib.bean.ImageResult;
import king.bird.spiderlib.listener.ImageResultListener;

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/19
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class MainAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String url = "http://www.mzitu.com/tag/ugirls/";
        //获取指定网站指定标签内属性
        SpiderUtil.Companion.getImageByUrl(url, new ImageResultListener() {
            @Override
            public void result(@NotNull HashSet<ImageResult> imageList) {

            }
        });

    }
}

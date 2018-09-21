# 最简单的万能爬虫器

### 项目介绍
- 爬取指定网站url所有图片以及描述信息
- 爬取指定网站中任何标签下的任意属性

##### 1.获取所有图片以及描述信息
```java
    ImageResult(name='142847_16a48_236.jpg', url='http://i.meizitu.net/thumbs/2018/07/142847_16a48_236.jpg', desc='艺妓的诱惑 日系美女水嫩性感柔媚多情', extendOne='')
    ImageResult(name='146379_12c46_236.jpg', url='http://i.meizitu.net/thumbs/2018/08/146379_12c46_236.jpg', desc='美到喷血! 尤果女神韩安琪美艳性感尽显成熟女人味', extendOne='')
    ImageResult(name='144268_27c28_236.jpg', url='http://i.meizitu.net/thumbs/2018/07/144268_27c28_236.jpg', desc='妩媚小女人张馨彤为诱惑而生 水湿白衬衫酥胸诱人', extendOne='')
    ImageResult(name='137510_05b45_236.jpg', url='http://i.meizitu.net/thumbs/2018/06/137510_05b45_236.jpg', desc='尤果女神李莉莉高清写真 雪白酥胸诱惑满满', extendOne='')
    ImageResult(name='147468_20f29_236.jpg', url='http://i.meizitu.net/thumbs/2018/08/147468_20f29_236.jpg', desc='气质满分！美女尤物美人骆雪淇白嫩美腿妩媚动人', extendOne='')
    ImageResult(name='150001_07b63_236.jpg', url='http://i.meizitu.net/thumbs/2018/09/150001_07b63_236.jpg', desc='微胖小姐姐白晓白 轻熟的气质让你欲罢不能', extendOne='')
    ImageResult(name='140752_29b05_236.jpg', url='http://i.meizitu.net/thumbs/2018/07/140752_29b05_236.jpg', desc='尤果美女轮番上阵诱惑升级 清凉陪你度过甜蜜盛夏', extendOne='')
    ImageResult(name='147534_20e07_236.jpg', url='http://i.meizitu.net/thumbs/2018/08/147534_20e07_236.jpg', desc='还是熟妇最有味道 成熟端庄万种风情', extendOne='')

```
##### 2.获取指定标签（img）下面指定属性（"data-original", "alt"）
```java
    [http://i.meizitu.net/thumbs/2018/08/148211_26b29_236.jpg, 尤果女神方子萱奶大腿长屁股翘，动作挑逗引人遐想]
    [http://i.meizitu.net/thumbs/2018/06/140460_28c43_236.jpg, 妩媚轻熟女极品美臀大胆露出 惹火身材完美勾魂]
    [http://i.meizitu.net/thumbs/2018/06/138976_16y03_236.jpg, 气质小姐姐清爽优雅魅力难挡 性感妩媚尽显轻熟女范]
    [http://i.meizitu.net/thumbs/2018/06/140116_25c19_236.jpg, 御姐气息十足，尤果模特莫妮卡尽显精致小女人气质]
    [http://i.meizitu.net/thumbs/2018/08/145201_02a09_236.jpg, 妖艳御姐萌汉药萌汉药baby撩衣露乳激情销魂]
```

### 最简单使用方式

##### 1. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
##### 2. Add the dependency

```java
dependencies {
	        implementation 'com.github.pengMaster:SpiderTool:1.0.0'
	}
```
##### 3. Add use to activity

```java

         案例： 获取妹子图网站所有图片
           //妹子图网站Url
           val url = "http://www.mzitu.com/tag/ugirls/"
           //kotlin 获取该网站所有图片以及描述信息
           SpiderUtil.getImageByUrl(url, object : ImageResultListener {
                override fun result(imageList: HashSet<ImageResult>) {
                    mTvContent.text = imageList.toString()
                    imageList.forEach {
                        Log.e("getImageByUrl", it.toString())
                    }

                }
            })
```
```java
           //java 版
            SpiderUtil.Companion.getImageByUrl(url, new ImageResultListener() {
                @Override
                public void result(@NotNull HashSet<ImageResult> imageList) {

                }
            });
```
```java
          案例： 获取妹子图网站所有img标签下"data-original", "alt"
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

```

##### 4. add permission to your menifest

```java
    <!--联网-->
    <uses-permission android:name="android.permission.INTERNET" />
```
#### 注意
    1.比如妹子图网站获取的图片url如果进行展示或者下载，需要进行防盗链处理操作
    2.获取指定标签下的指定属性
    例如：
```java
<img width='236' height='354' class='lazy' alt='清纯中带着性感 尤果网女神美替极品身材一览无遗' src='http://i.meizitu.net/pfiles/img/lazy.png' data-original='http://i.meizitu.net/thumbs/2018/09/150833_14c39_236.jpg' />
```
    获取img标签下  alt  src 属性
    tag = img
    list = ("alt",  "src")


#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### github地址

 - 项目地址：https://github.com/pengMaster/SpiderTool


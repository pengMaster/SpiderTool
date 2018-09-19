package king.bird.spiderlib.listener

import king.bird.spiderlib.bean.ImageResult

/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/19
 *     desc   :
 *     version: 1.0
 * </pre>
 */
interface ImageResultListener {
    fun result(imageList: HashSet<ImageResult>)
}
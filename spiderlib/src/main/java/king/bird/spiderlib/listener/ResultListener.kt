package king.bird.spiderlib.listener


/**
 * <pre>
 *     author : Wp
 *     e-mail : 18141924293@163.com
 *     time   : 2018/09/19
 *     desc   :
 *     version: 1.0
 * </pre>
 */
interface ResultListener {
    fun result(list: HashSet<ArrayList<String>>)
}
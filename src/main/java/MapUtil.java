import java.util.Map;

/**
 * 创建者   xiaoting.
 * 时间    2016/12/22.
 * 版本    v-0.01.
 * 说明   map集合操作.
 */
public final class MapUtil {
    /**
     * 构造器.
     */
    private MapUtil() {
    }

    /**
     * 判断Map集合是否为空.
     * 为空返回true  不为空返回false.
     *
     * @param map 请求的Map.
     * @param <K> key类型.
     * @param <V> value类型.
     * @return true/false.
     */
    public static <K, V> boolean isNull(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    /**
     * 判断Map集合不为空.
     * 不为空返回true，为空返回false.
     *
     * @param map 请求的参数.
     * @param <K> key.
     * @param <V> value.
     * @return true/false.
     */
    public static <K, V> boolean isNotNull(Map<K, V> map) {
        return !isNull(map);
    }


}

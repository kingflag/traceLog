package hello.utils;

import java.util.UUID;

/**
 * @author kingflag
 *         Created by kingflag on 2019/6/4.
 */
public class TraceLogUtils {

    public static String getTraceId() {
        return String.valueOf(UUID.randomUUID()).replace("-", "");
    }
}

package pl.edu.agh.util;

import io.netty.buffer.ByteBuf;
import org.apache.commons.lang3.SerializationUtils;

public class MessageUtil {
    public static Object toObject(ByteBuf byteBuf) {
        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.getBytes(0, bytes);
        return SerializationUtils.deserialize(bytes);
    }
}

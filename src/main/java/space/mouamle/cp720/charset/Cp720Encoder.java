package space.mouamle.cp720.charset;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class Cp720Encoder extends CharsetEncoder {

    protected Cp720Encoder(Charset cs) {
        super(cs, 1.0f, 1.0f);
    }

    @Override
    protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
        try {
            while (in.hasRemaining()) {
                out.put(Cp720Mapping.encode(in.get()));
            }
        } catch (BufferOverflowException x) {
            return CoderResult.OVERFLOW;
        }
        return CoderResult.UNDERFLOW;
    }

}

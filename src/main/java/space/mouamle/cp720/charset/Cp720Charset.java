package space.mouamle.cp720.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Cp720Charset extends Charset {
    public static Cp720Charset INSTANCE = new Cp720Charset();

    private static final String[] aliases = {"DOS-720", "Arabic (Transparent ASMO)", "Arabic (DOS)"};

    protected Cp720Charset() {
        super("CP720", aliases);
    }

    @Override
    public boolean contains(Charset cs) {
        return cs instanceof Cp720Charset;
    }

    @Override
    public CharsetDecoder newDecoder() {
        return new Cp720Decoder(this);
    }

    @Override
    public CharsetEncoder newEncoder() {
        return new Cp720Encoder(this);
    }

    public static String[] getAliases() {
        return aliases;
    }

}

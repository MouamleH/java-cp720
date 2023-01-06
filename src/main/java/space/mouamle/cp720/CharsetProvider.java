package space.mouamle.cp720;

import space.mouamle.cp720.charset.Cp720Charset;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;

public class CharsetProvider extends java.nio.charset.spi.CharsetProvider {

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public Iterator charsets() {
        return Collections.singletonList(Cp720Charset.INSTANCE).iterator();
    }

    @Override
    public Charset charsetForName(String charsetName) {
        if (charsetName.equalsIgnoreCase(Cp720Charset.INSTANCE.name())) {
            return Cp720Charset.INSTANCE;
        }

        for (String alias : Cp720Charset.getAliases()) {
            if (alias.equalsIgnoreCase(charsetName)) {
                return Cp720Charset.INSTANCE;
            }
        }

        return null;
    }

}

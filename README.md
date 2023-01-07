[![](https://jitpack.io/v/MouamleH/java-cp720.svg)](https://jitpack.io/#MouamleH/java-cp720)
# Java [Cp720](https://en.wikipedia.org/wiki/Code_page_720)

Cp720 Codepage (AKA: DOS-720, AKA: Arabic (Transparent ASMO), AKA: Arabic (DOS)) charset implementation for Java

## Usage

### Encoding
```java
String arabicText = "أبجد هوز حطي كلمن سعفص قرشت ثخذ ضظغ";
byte[] bytes = arabicText.getBytes(Cp720Charset.INSTANCE);

// Signed
// bytes => [-102, -96, -92, -89, 32, -20, -19, -86, 32, -91, -31, -17, 32, -24, -23, -22, -21, 32, -85, -29, -27, -83, 32, -25, -87, -84, -94, 32, -93, -90, -88, 32, -32, -30, -28]
    
// Unsigned
// bytes => [0x9a, 0xa0, 0xa4, 0xa7, 0x20, 0xec, 0xed, 0xaa, 0x20, 0xa5, 0xe1, 0xef, 0x20, 0xe8, 0xe9, 0xea, 0xeb, 0x20, 0xab, 0xe3, 0xe5, 0xad, 0x20, 0xe7, 0xa9, 0xac, 0xa2, 0x20, 0xa3, 0xa6, 0xa8, 0x20, 0xe0, 0xe2, 0xe4]
```

### Decoding
```java
byte[] Cp720String = {-102, -96, -92, -89, 32, -20, -19, -86, 32, -91, -31, -17, 32, -24, -23, -22, -21, 32, -85, -29, -27, -83, 32, -25, -87, -84, -94, 32, -93, -90, -88, 32, -32, -30, -28};
String arabicString = new String(Cp720String, Cp720Charset.INSTANCE);
// arabicString => أبجد هوز حطي كلمن سعفص قرشت ثخذ ضظغ
```

### References
- [Code Page 720 Wikipedia Page](https://en.wikipedia.org/wiki/Code_page_720)
- [Microsoft code-page-identifiers](https://learn.microsoft.com/en-us/windows/win32/intl/code-page-identifiers#:~:text=720,DOS%2D720)
- [Python Code Page 720 Table](https://github.com/python/cpython/blob/main/Lib/encodings/cp720.py)

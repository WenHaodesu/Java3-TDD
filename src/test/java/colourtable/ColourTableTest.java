package colourtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTableTest {

    @Test
    void testColourTableConstructor() {
        // 测试无效参数，确保构造函数抛出 IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            new ColourTable(-1);  // 提供无效参数 -1
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new ColourTable(3);  // 提供无效参数 3
        });

        // 测试有效参数，确保不会抛出异常
        assertDoesNotThrow(() -> {
            new ColourTable(0);  // 提供有效参数 0
        });

        assertDoesNotThrow(() -> {
            new ColourTable(1);  // 提供有效参数 1
        });

        assertDoesNotThrow(() -> {
            new ColourTable(2);  // 提供有效参数 2
        });
    }
}



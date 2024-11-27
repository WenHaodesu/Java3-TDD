package colourtable;

public class ColourTable {
    // 示例构造方法
    public ColourTable(int parameter) {
        // 假设合法参数为 0, 1, 2，如果参数不在此范围则抛出异常
        if (parameter < 0 || parameter > 2) {
            throw new IllegalArgumentException("Invalid parameter: " + parameter);
        }
        // 其他初始化逻辑
    }
}




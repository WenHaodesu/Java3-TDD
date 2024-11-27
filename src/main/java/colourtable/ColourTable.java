package colourtable;

public class ColourTable {
    // Color palette size
    private int size;

    public ColourTable(int parameter) {
        // Modify the parameter checking logic to ensure that 0, 1, and 2 are valid.
        if (parameter < 0 || parameter > 2) {
            throw new IllegalArgumentException("Invalid parameter: " + parameter);
        }
        this.size = parameter;
        // Other logical (empty implementation)
    }
}






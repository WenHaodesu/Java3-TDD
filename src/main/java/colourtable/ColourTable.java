package colourtable;

public class ColourTable {
    // Color palette size
    private int size;

    public ColourTable(int colorPaletteSize) {
        // Call the parameter validation method.
        validateParameter(colorPaletteSize);
        this.size = colorPaletteSize;
        // Initializing other logic in the colour table.
    }

    // Parameter validation method
    private void validateParameter(int colorPaletteSize) {
        if (colorPaletteSize < 0 || colorPaletteSize > 2) {
            throw new IllegalArgumentException("Invalid parameter: " + colorPaletteSize);
        }
    }
}







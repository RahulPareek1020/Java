package SOLID.L.Problem2;

public class Rectangle {
    private int _width;
    private int _height;

    Rectangle() {
    }

    Rectangle(int width, int height) {
        SetHeight(height);
        SetWeight(width);
    }

    public void SetHeight(int height) {
        _height = height;
    }

    public int GetHeight() {
       return _height;
    }

    public void SetWeight(int width) {
        _width = width;
    }

    public int GetWeight() {
        return _width;
    }

    public float CalculateArea() {
       return  _width * _height;
    }
}

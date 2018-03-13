package com.example.apbc.waterexpert;

public class ParaData {
    private String turbidity;
    private String source;
    private String taste;
    private String odour;
    private String color;
    private String result;

    public String getOdour() {
        return odour;
    }

    public void setOdour(String odour) {
        this.odour = odour;
    }

    public String getTurbidity() {
        return turbidity;
    }

    @Override
    public String toString() {
        return "ParaData{" +
                "turbidity='" + turbidity + '\'' +
                ", source='" + source + '\'' +
                ", taste='" + taste + '\'' +
                ", odour='" + odour + '\'' +
                ", color='" + color + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public void setTurbidity(String turbidity) {
        this.turbidity = turbidity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

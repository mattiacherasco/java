public class Temperatura {
    private float tempC;

    public String toString() {
        return "la temperatura in centigradi è "+ tempC + " mentre in faranyte è "+ getTempF();

    }

    public float getTempF() {
        return (tempC * 9 / 5) + 32;
    }

    public float getTempC() {
        return tempC;
    }

    public void setTempC(float tempC) {
        this.tempC = tempC;
    }

    public Temperatura(float tempC){
        this.tempC=10;
    }

}


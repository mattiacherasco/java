public class Telecomando {
    private boolean acceso;
    private int canale;
    private int volume;
    private boolean muto;
    private final int VOLUME_MAX;
    private final int CANALE_MAX;   //<>
    private static int VOLUME_DEFAULT = 100;
    private static int CANALE_DEFAULT = 999;

    public Telecomando(int volumeMax, int canaleMax) {
        if (volumeMax <= 1) {
            this.VOLUME_MAX = VOLUME_DEFAULT;
        } else {
            this.VOLUME_MAX = volumeMax;
        }
        if (canaleMax <= 1) {
            this.CANALE_MAX = CANALE_DEFAULT;
        } else {
            this.CANALE_MAX = canaleMax;
        }
        this.volume = VOLUME_MAX / 2;
        this.canale = 1;
        acceso = false;
        muto = false;
    }

    public void setOnOff() {

        acceso = !acceso;
    }

    public void alzaVolume() {
        if (acceso == true) {
            if (volume < VOLUME_MAX) {
                volume++;
            }
        }
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        } else {
            muto = true;
        }
    }

    public void alzaCanale() {
        if (canale < CANALE_MAX) {
            canale++;
        } else {
            canale = 1;
        }
    }

    public void abbassaCanale() {
        if (canale > 1) {
            canale--;
        } else {
            canale = 999;
        }
    }

    public void setCanale(int canale) {
        if (canale >= 1 && canale <= CANALE_MAX) {
            this.canale = canale;
        }
    }

    public boolean isAcceso() {
        return acceso;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanale() {
        return canale;
    }

    public boolean isMuto() {
        return muto;
    }

    public void muteOnOff() {
        if (acceso) {
            muto = !muto;
        }
    }
    public String toString() {
        return "Telecomando [acceso=" + acceso + ", canale=" + canale + ", volume=" + volume + ", muto=" + muto
                + ", VOLUME_MAX=" + VOLUME_MAX + ", CANALE_MAX=" + CANALE_MAX + "]";
    }
}

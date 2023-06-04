package structural.bridge;

abstract class Beer {

    protected final boolean dryHopping;

    protected final String hop;

    protected final int ibu;

    Beer(boolean dryHopping, String hop, int ibu) {
        this.dryHopping = dryHopping;
        this.hop = hop;
        this.ibu = ibu;
    }

    public boolean hasDryHopping() {
        return dryHopping;
    }

    public String getHop() {
        return hop;
    }

    public int getIbu() {
        return ibu;
    }
}

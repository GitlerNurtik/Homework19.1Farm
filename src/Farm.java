import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String ownerName;

    @Override
    public String toString() {
        return
                "address: " + address + "\n" + "=============================="+
                " cows: " + Arrays.toString(cows) +"\n"+ "=============================="+
                " horses: " + Arrays.toString(horses) +"\n"+ "=============================="+
                " sheep: " + Arrays.toString(sheep) +"\n"+ "=============================="+
                " ownerName: " + ownerName + "\n";
    }

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

package me.limpeex.pazar;

public class PazarSlotThrower{
    private String name;
    private int slot;

    public PazarSlotThrower(String name, int slot) {
        this.name = name;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

}

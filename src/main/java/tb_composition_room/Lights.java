package tb_composition_room;

public class Lights {
    private Chandelier chandelier;
    private TableLamp tableLamp;
    private FloorLamp floorLamp;
    private int numberOfTableLamps;
    private int numberOfFloorLamps;

    public Lights(Chandelier chandelier, TableLamp tableLamp, FloorLamp floorLamp, int numberOfTableLamps, int numberOfFloorLamps) {
        this.chandelier = chandelier;
        this.tableLamp = tableLamp;
        this.floorLamp = floorLamp;
        this.numberOfTableLamps = numberOfTableLamps;
        this.numberOfFloorLamps = numberOfFloorLamps;
    }

    public Chandelier getChandelier() {
        return chandelier;
    }

    public TableLamp getTableLamp() {
        return tableLamp;
    }

    public FloorLamp getFloorLamp() {
        return floorLamp;
    }

    public int getNumberOfTableLamps() {
        return numberOfTableLamps;
    }

    public int getNumberOfFloorLamps() {
        return numberOfFloorLamps;
    }
}

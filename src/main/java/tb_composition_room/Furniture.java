package tb_composition_room;

public class Furniture {
    private Bed bed;
    private Sofa sofa;
    private Cupboard cupboard;
    private Table table;
    private Chair chair;


    public Furniture(Bed bed, Sofa sofa, Cupboard cupboard, Table table, Chair chair) {
        this.bed = bed;
        this.sofa = sofa;
        this.cupboard = cupboard;
        this.table = table;
        this.chair = chair;
    }

    public void cleanFurniture() {
        bed.makeBed();
        sofa.openSofa();
        cupboard.openCupboard();
        table.coverTheTable();
        chair.moveChair();
    }

    public Bed getBed() {
        return bed;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }
}

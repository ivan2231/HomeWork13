public class GryffindorStudent extends HogwartsStudent{
    private int mobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int mobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.mobility = mobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getMobility() {
        return mobility;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s:%d vs %d %n", getName(), gryffindorStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s:%d vs %d %n", gryffindorStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Гриффиндорец %s такой же,как Гриффиндорец %s:%d vs %d %n", gryffindorStudent.getName(), ability1, ability2);
        }
    }

    private int ability() {
        return mobility + honor + bravery;
    }
}

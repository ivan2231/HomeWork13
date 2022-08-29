public class HufflenpuffStudent extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflenpuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compareHufflenpuff(HufflenpuffStudent hufflenpuffStudent) {
        int ability1 = ability();
        int ability2 = hufflenpuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуй %s лучше, чем Пуффендуй %s:%d vs %d %n", getName(), hufflenpuffStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуй %s лучше, чем Пуффендуй %s:%d vs %d %n", hufflenpuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуй %s такой же,как Пуффендуй %s:%d vs %d %n", hufflenpuffStudent.getName(), ability1, ability2);
        }
    }

    private int ability() {
        return diligence + loyalty + honesty;
    }
    @Override
    public String toString() {
        return String.format("%s;трудолюбие:%d;верность:%d;честность:%d",super.toString(), diligence,loyalty,honesty);
    }
}


class cashpos{
    public static void main(String[] args) {
        int rr=12000;
        int mm=4000;
        int sco=3000;
        int intrestonfd=3000;
        int maintanencecharges=4000;
        int ppt=2000;
        int bonus=8000;
        int gra=5000;

        int inc=rr+sco+intrestonfd+bonus+gra;
        int exp=mm+maintanencecharges+ppt;
        System.out.println(inc-exp);

    }
}
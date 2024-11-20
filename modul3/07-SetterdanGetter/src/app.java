class Data{
    //data member atau variabel instant
    public int intPublic ;
    private int intPrivate ;
    private double doublePrivate ;

    //konstruktor, modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
    }

    // method untuk membaca / GETTER
    public  int getIntPrivate(){
        return this.intPrivate ;
    }

    // method untuk menulis / SETTER
    public void setDoublePrivate(double value){

    }

    //method untuk membaca semua variabel
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}
    public class app {
        public static void main(String[] args) {
            //insansiasi objek
            Data data1 = new Data();

            //membaca dan menulis menggunakan public
            data1.intPublic = 5 ; //membaca
            //menulis 
            System.out.println("public : " + data1.intPublic);

            //membaca menggunakan GETTER
            int angka = data1.getIntPrivate();
            System.out.println("private :" + angka);

            //menulis menggunakan SETTER
            data1.setDoublePrivate(3.14);
            //membaca semua variabel
            data1.cetak();


    }

}
package second_week.interfaces;


    interface piecPiekacz{
        void pieczenieChleba();
        void pieczenieCiastek();
    }

    interface piecGrill{
        void grillowanieKurczaka();
    }

    public class piec implements piecPiekacz, piecGrill{

        private int czas;
        private int temperatura;

        @Override
        public void pieczenieChleba(){
            czas=120;
            temperatura=170;
            wlacz();
        }

        @Override
        public void pieczenieCiastek(){
            czas=30;
            temperatura=180;
            wlacz();
        }

        @Override
        public void grillowanieKurczaka(){
            czas=30;
            temperatura=170;
            wlacz();
        }

        private void wlacz(){
            System.out.println("Włączamy piec i ustawiamy temperaturę na: " + temperatura + " stopni i czas na " + czas + " minut.");
        }

        public static void main(String[] args) {
            piec piec=new piec();

            piecPiekacz piekacz=piec;
            piecGrill grill=piec;

            piekacz.pieczenieChleba();
            piekacz.pieczenieCiastek();
            grill.grillowanieKurczaka();
        }
    }


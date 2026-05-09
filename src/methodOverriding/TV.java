package methodOverriding;

class TV {
    public void switchOn() {
        System.out.println("TV is switched on");
    }

    public void changeChannel() {
        System.out.println("TV channel is changed");
    }

    class SmartTV extends TV {
        public void switchOn() {
            System.out.println("Smart Tv switched on");
        }

        public void changeChannel() {
            System.out.println("Smart Tv channel is changed");
        }

        public void browSer() {
            System.out.println("Smart tv browsing");
        }
    }

    public static class Overriding {
        public static void main(String[] args) {

             TV t = new TV();
            t.switchOn();
            t.changeChannel();
        }
    }
}


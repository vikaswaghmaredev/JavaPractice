package practiseStatic;

//import static HondaCity.price;

class HondaCity {

    static long price = 1000;
    int a, b;

    static double onRaodPrice(String city) {

        switch (city) {
            case "delhi":
                return price + price * 0.1;
            case "mumbai":
                return price + price * 0.09;

        }
        return onRaodPrice(city);
    }
    public class Test{
      public static void main(String[] args) {

          HondaCity.onRaodPrice("Delhi");
          System.out.println(HondaCity.price);
      }
  }

}

import java.util.Random;




public class TemperatureMeteoApp {
    public static void main(String[] args) {


          OpenMeteoProvider.getCurrentTemperature(016);
          PrivateMeteoProvider.getCurrentTemperature(PrivateMeteoProvider.getCurrentHumidity(012));

          OpenMeteoProvider.getCurrentTemperature(011);
          PrivateMeteoProvider.getCurrentHumidity(011);
    }
}

class OpenMeteoProvider {
    static double getCurrentTemperature(int countryCode) {
        Random random = new Random();

        switch (countryCode) {
            case 004:
                int rand = 0;
                while (true) {
                    rand = random.nextInt(50);
                    if (rand != 0) break;
                }
                String[] trueFalse = {"+", "-"};
                String random1 = (trueFalse[new Random().nextInt(trueFalse.length)]);
                System.out.println("The temeperture in Afghanistan is  " + random1 + (double) rand);
                break;
            case 010:
                int rand1 = 0;
                while (true) {
                    rand1 = random.nextInt(50);
                    if (rand1 != 0) break;
                }
                String[] trueFalse1 = {"+", "-"};
                String random2 = (trueFalse1[new Random().nextInt(trueFalse1.length)]);
                System.out.println("The temeperture in Antarctica is  " + random2 + (double) rand1);
                break;
            case 012:
                int rand2 = 0;
                while (true) {
                    rand2 = random.nextInt(50);
                    if (rand2 != 0) break;
                }
                String[] trueFalse2 = {"+", "-"};
                String random3 = (trueFalse2[new Random().nextInt(trueFalse2.length)]);
                System.out.println("The temeperture in Algeria is  " + random3 + (double) rand2);
                break;
            case 016:
                int rand3 = 0;
                while (true) {
                    rand3 = random.nextInt(50);
                    if (rand3 != 0) break;
                }
                String[] trueFalse3 = {"+", "-"};
                String random4 = (trueFalse3[new Random().nextInt(trueFalse3.length)]);
                System.out.println("The temeperture in American Samoa is  " + random4 + (double) rand3);
                break;
            case 020:
                int rand4 = 0;
                while (true) {
                    rand4 = random.nextInt(50);
                    if (rand4 != 0) break;
                }
                String[] trueFalse4 = {"+", "-"};
                String random5 = (trueFalse4[new Random().nextInt(trueFalse4.length)]);
                System.out.println("The temeperture in Andorra is  " + random5 + (double) rand4);
                break;
            default:
                System.err.println("Can't provide data for this country!");

        }


        return countryCode;
    }


    }

    class PrivateMeteoProvider extends OpenMeteoProvider  {

        static byte getCurrentHumidity(int countryCode)  {


            Random random = new Random();
            switch (countryCode) {
                case 004:
                    int rand = 0;
                    while (true) {
                        rand = random.nextInt(100);
                        if (rand != 0) break;
                    }
                    System.out.println("The air humidity in Afghanistan is  " + (byte) rand + "%");
                    break;
                case 010:
                    int rand1 = 0;
                    while (true) {
                        rand1 = random.nextInt(100);
                        if (rand1 != 0) break;
                    }
                    System.out.println("The air humidity in Antarctica is " + (byte) rand1 + "%");
                    break;
                case 012:
                    int rand2 = 0;
                    while (true) {
                        rand2 = random.nextInt(100);
                        if (rand2 != 0) break;
                    }
                    System.out.println("The air humidity in Algeria is  " + (byte) rand2 + "%");
                    break;
                case 016:
                    int rand3 = 0;
                    while (true) {
                        rand3 = random.nextInt(100);
                        if (rand3 != 0) break;
                    }
                    System.out.println("The air humidity in American Samoa is  " + (byte) rand3 + "%");
                    break;
                case 020:
                    int rand4 = 0;
                    while (true) {
                        rand4 = random.nextInt(100);
                        if (rand4 != 0) break;
                    }

                    System.out.println("The air humidity in Andorra is  "+ (byte) rand4 + "5");
                    break;
                default:
                    System.err.println("Can't provide data for this country!");
            }

        return (byte)countryCode;
    }
}




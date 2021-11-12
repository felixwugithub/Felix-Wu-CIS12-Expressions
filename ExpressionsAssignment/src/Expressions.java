public class Expressions {
    public static void main(String[] args) {

        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        //Evaluation 1
        System.out.println(5 + 10/2 - (4 - 8)/3);
        System.out.println(5 + 10/2 - (-4)/3);
        System.out.println(5 + 5 - (-4)/3);
        System.out.println(5 + 5 - (-1));
        System.out.println(10 - (-1));
        System.out.println(11);


        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        //Evaluation 2
        System.out.println(23%4 + (18 - 1));
        System.out.println(23%4 + 17);
        System.out.println(3 + 17);
        System.out.println(20);


        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        //Evaluation 3
        System.out.println(3 + Math.pow(3,4)/5);
        System.out.println(3 + (double)81/5);
        System.out.println(3 + 16.2);
        System.out.println(19.2);

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        //Evaluation 4
        System.out.println(1 - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(1 - 8 + Math.pow(2,3) / 8 + (9 / 3));
        System.out.println(1 - 8 + Math.pow(2,3) / 8 + 3);
        System.out.println((double)(1 - 8 + 8 / 8 + 3));
        System.out.println((double)(1 - 8 + 1 + 3));
        System.out.println((double)((-7) + 1 + 3));
        System.out.println((double)((-6) + 3));
        System.out.println((double)(-3));

        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        //Evaluation 5
        System.out.println(((7 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * 0.8509035245341184 + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((8.509035245341184 + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(10.509035245341184 - Math.pow(Math.sqrt(25), 3));
        System.out.println(10.509035245341184 - Math.pow(5, 3));
        System.out.println(10.509035245341184 - 125);
        System.out.println(-114.49096475465882);


    }
}


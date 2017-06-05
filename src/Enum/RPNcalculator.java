package Enum;

public class RPNcalculator {


    public int calculate(String rpnString){
        int result = 0;

        int count = 0;
        String[] retval = rpnString.split(" ");

         while (retval.length > count){
            if(retval[count].matches("^[0-9]+$")){
            }
            else {
                try {
                    switch (getValue(retval[count])) {
                        case ADDITION:
                            System.out.println(Sign.ADDITION.toString());
                            break;

                        case DIVISION:
                            System.out.println(Sign.DIVISION.toString());

                            break;

                        case MULTIPLICATION:
                            System.out.println(Sign.MULTIPLICATION.toString());

                            break;

                        case SUBTRACTION:
                            System.out.println(Sign.SUBTRACTION.toString());

                            break;

                        default:
                            throw new IllegalArgumentException("Input elements are wrong!");
                    }
                }catch (IllegalArgumentException e){
                    System.out.println(e);
                }
            }
            count++;
        }

        return result;
    }
    private Sign getValue(String key) {
        if ("+".equals(key)) { return Sign.ADDITION; }
        else if ("-".equals(key)) { return Sign.SUBTRACTION; }
        else if ("*".equals(key)) { return Sign.MULTIPLICATION; }
        else if ("/".equals(key)) { return Sign.DIVISION; }
        else throw new IllegalArgumentException("Input elements are wrong!");
    }

    public static void main(String[] args) {
        RPNcalculator rpNcalculator  = new RPNcalculator();
        rpNcalculator.calculate("1 2 - + - * ");


        Sign signAdd = Sign.ADDITION;
        System.out.println(signAdd.getKey());
        System.out.println(Sign.SUBTRACTION.getKey());
    }



}

import java.io.IOException;
import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(System.in);
        String primer = scan.nextLine();
        int a = 1;
        int b = 1;
        byte c = 1;
        byte z = 0;
        int lgh = primer.length();
        String ver = "";
        String rev = "";
        String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };


        for (int i = lgh - 1; i >= 0; i--) {

            char q = primer.charAt(i);
            try {
                if (q != '1' & q != '2' & q != '3' & q != '4' & q != '5' & q != '6' & q != '7' & q != '8' & q != '9' & q != '0' & q != '+' & q != '-' & q != '*' & q != '/' & q != 'I' & q != 'V' & q != 'X') {
                    throw new IOException();
                }
            } catch (IOException e) {
                System.out.println("Exception");
                return;
            }
            if (q == 'I' | q == 'V' | q == 'X'| q == '+' | q == '-' | q == '*' | q == '/' ) {

                ver += q;
                if(i == 0){

                    for (int m = lgh - 1; m >= 0; m--) {

                        q = ver.charAt(m);
                        if(q == '+' | q == '-' | q == '*' | q == '/'){

                            for(int o = 1; o <= 10; o++){

                                if(roman[o].equals(rev)){

                                    a = o;

                                }
                            }
                           if ( q == '+') {

                               z = 1;
                           }if ( q == '-') {

                                z = 2;
                            }if ( q == '*') {

                                z = 3;
                            }if ( q == '/') {

                                z = 4;
                            }

                        }
                        rev += q;
                        if(q == '+' | q == '-' | q == '*' | q == '/'){

                            rev = "";
                        }
                        if(m == 0){

                            for(int o = 1; o <= 10; o++){

                                if(roman[o].equals(rev)){

                                    b = o;

                                }
                            }
                            if( z == 1){

                                int otvet = a + b;
                                System.out.println(roman[otvet]);



                            }if( z == 2){

                                int otvet = a - b;
                               try{

                                   if (otvet <= 0){

                                       throw new IOException();
                                   }
                               }catch (IOException e) {

                                   System.out.println("Exception");
                                   return;
                               }
                                System.out.println(roman[otvet]);

                            }if( z == 3){

                                int otvet = a * b;

                                System.out.println(roman[otvet]);
                            }if( z == 4){

                                int otvet = a / b;
                                System.out.println(roman[otvet]);
                            }
                        }
                    }
                }

            }
            if( q == '1' | q == '2' | q == '3' | q == '4' | q == '5' | q == '6' | q == '7' | q == '8' | q == '9' | q == '+' | q == '-' | q == '*' | q == '/' | q == '0'){
                if (q == '1') {
                    b += c;
                    c *= 10;
                }
                if (q == '2') {
                    b += 2 * c;
                    c *= 10;
                }
                if (q == '3') {
                    b += 3 * c;
                    c *= 10;
                }
                if (q == '4') {
                    b += 4 * c;
                    c *= 10;

                }
                if (q == '5') {
                    b += 5 * c;
                    c *= 10;
                }
                if (q == '6') {
                    b += 6 * c;
                    c *= 10;
                }
                if (q == '7') {
                    b += 7 * c;
                    c *= 10;
                }
                if (q == '8') {
                    b += 8 * c;
                    c *= 10;
                }
                if (q == '9') {
                    b += 9 * c;
                    c *= 10;

                }
                if (q == '0') {
                    c *= 10;
                }
                if (q == '-' | q == '+' | q == '*' | q == '/') {
                    c = 1;
                    if (q == '+') {
                        for (int p = i - 1; p >= 0; p--) {
                            char o = primer.charAt(p);
                            try {
                                if (o != '1' & o != '2' & o != '3' & o != '4' & o != '5' & o != '6' & o != '7' & o != '8' & o != '9' & o != '0' & o != '+' & o != '-' & o != '*' & o != '/' & o != 'I' & o != 'V' & o != 'X') {
                                    throw new IOException();
                                }
                            } catch (IOException e) {
                                System.out.println("Exception");
                                return;
                            }
                            if (o == '1') {
                                a += c;
                                c *= 10;
                            }
                            if (o == '2') {
                                a += 2 * c;
                                c *= 10;
                            }
                            if (o == '3') {
                                a += 3 * c;
                                c *= 10;
                            }
                            if (o == '4') {
                                a += 4 * c;
                                c *= 10;
                            }
                            if (o == '5') {
                                a += 5 * c;
                                c *= 10;
                            }
                            if (o == '6') {
                                a += 6 * c;
                                c *= 10;
                            }
                            if (o == '7') {
                                a += 7 * c;
                                c *= 10;
                            }
                            if (o == '8') {
                                a += 8 * c;
                                c *= 10;
                            }
                            if (o == '9') {
                                a += 9 * c;
                                c *= 10;
                            }
                            if (o == '0') {
                                c *= 10;
                            }


                        }
                        i = -1;
                        a--;
                        b--;
                        try {
                            if (a < 1 | a > 10 | b < 1 | b > 10) {
                                throw new IOException();
                            }
                        } catch (IOException e) {
                            System.out.println("Exception");
                            return;
                        }
                        int otvet = a + b;
                        System.out.println("=" + otvet);
                        return;
                    }
                    if (q == '-') {
                        for (int p = i - 1; p >= 0; p--) {
                            char o = primer.charAt(p);
                            try {
                                if (o != '1' & o != '2' & o != '3' & o != '4' & o != '5' & o != '6' & o != '7' & o != '8' & o != '9' & o != '0' & o != '+' & o != '-' & o != '*' & o != '/' & o != 'I' & o != 'V' & o != 'X') {
                                    throw new IOException();
                                }
                            } catch (IOException e) {
                                System.out.println("Exception");
                                return;
                            }
                            if (o == '1') {
                                a += c;
                                c *= 10;
                            }
                            if (o == '2') {
                                a += 2 * c;
                                c *= 10;
                            }
                            if (o == '3') {
                                a += 3 * c;
                                c *= 10;
                            }
                            if (o == '4') {
                                a += 4 * c;
                                c *= 10;
                            }
                            if (o == '5') {
                                a += 5 * c;
                                c *= 10;
                            }
                            if (o == '6') {
                                a += 6 * c;
                                c *= 10;
                            }
                            if (o == '7') {
                                a += 7 * c;
                                c *= 10;
                            }
                            if (o == '8') {
                                a += 8 * c;
                                c *= 10;
                            }
                            if (o == '9') {
                                a += 9 * c;
                                c *= 10;
                            }
                            if (o == '0') {
                                c *= 10;
                            }
                        }
                        i = -1;
                        a--;
                        b--;
                        try {
                            if (a < 1 | a > 10 | b < 1 | b > 10) {
                                throw new IOException();
                            }
                        } catch (IOException e) {
                            System.out.println("Exception");
                            return;
                        }
                        int otvet = a - b;
                        System.out.println("=" + otvet);
                        return;

                    }
                    if (q == '*') {
                        for (int p = i - 1; p >= 0; p--) {
                            char o = primer.charAt(p);
                            try {
                                if (o != '1' & o != '2' & o != '3' & o != '4' & o != '5' & o != '6' & o != '7' & o != '8' & o != '9' & o != '0' & o != '+' & o != '-' & o != '*' & o != '/' & o != 'I' & o != 'V' & o != 'X') {
                                    throw new IOException();
                                }
                            } catch (IOException e) {
                                System.out.println("Exception");
                                return;
                            }
                            if (o == '1') {
                                a += 1 * c;
                                c *= 10;
                            }
                            if (o == '2') {
                                a += 2 * c;
                                c *= 10;
                            }
                            if (o == '3') {
                                a += 3 * c;
                                c *= 10;
                            }
                            if (o == '4') {
                                a += 4 * c;
                                c *= 10;
                            }
                            if (o == '5') {
                                a += 5 * c;
                                c *= 10;
                            }
                            if (o == '6') {
                                a += 6 * c;
                                c *= 10;
                            }
                            if (o == '7') {
                                a += 7 * c;
                                c *= 10;
                            }
                            if (o == '8') {
                                a += 8 * c;
                                c *= 10;
                            }
                            if (o == '9') {
                                a += 9 * c;
                                c *= 10;
                            }
                            if (o == '0') {
                                c *= 10;
                            }
                        }
                        i = -1;
                        a--;
                        b--;
                        try {
                            if (a < 1 | a > 10 | b < 1 | b > 10) {
                                throw new IOException();
                            }
                        } catch (IOException e) {
                            System.out.println("Exception");
                            return;
                        }
                        int otvet = a * b;
                        System.out.println("=" + otvet);
                        return;

                    }
                    if (q == '/') {
                        for (int p = i - 1; p >= 0; p--) {
                            char o = primer.charAt(p);
                            try {
                                if (o != '1' & o != '2' & o != '3' & o != '4' & o != '5' & o != '6' & o != '7' & o != '8' & o != '9' & o != '0' & o != '+' & o != '-' & o != '*' & o != '/' & o != 'I' & o != 'V' & o != 'X') {
                                    throw new IOException();
                                }
                            } catch (IOException e) {
                                System.out.println("Exception");
                                return;
                            }
                            if (o == '1') {
                                a += c;
                                c *= 10;
                            }
                            if (o == '2') {
                                a += 2 * c;
                                c *= 10;
                            }
                            if (o == '3') {
                                a += 3 * c;
                                c *= 10;
                            }
                            if (o == '4') {
                                a += 4 * c;
                                c *= 10;
                            }
                            if (o == '5') {
                                a += 5 * c;
                                c *= 10;
                            }
                            if (o == '6') {
                                a += 6 * c;
                                c *= 10;
                            }
                            if (o == '7') {
                                a += 7 * c;
                                c *= 10;
                            }
                            if (o == '8') {
                                a += 8 * c;
                                c *= 10;
                            }
                            if (o == '9') {
                                a += 9 * c;
                                c *= 10;
                            }
                            if (o == '0') {
                                c *= 10;
                            }
                        }
                        i = -1;
                        a--;
                        b--;
                        try {
                            if (a < 1 | a > 10 | b < 1 | b > 10) {
                                throw new IOException();
                            }
                        } catch (IOException e) {
                            System.out.println("Exception");
                            return;
                        }
                        int otvet = a / b;
                        System.out.println("=" + otvet);
                        return;
                    }
                }
            }
        }
    }

}




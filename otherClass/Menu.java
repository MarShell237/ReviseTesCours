package otherClass;
import java.util.InputMismatchException;
import java.util.Scanner;

import static otherClass.ReadFile.readFile;
import static otherclass.WriteFile.writeFile;

public class Menu {

    public static void nomDuJeu(){
        System.out.println();
        System.out.println();
        System.out.println("******************************************************************************************************");
        System.out.println("*                           01110                                                                    *");
        System.out.println("*                          1111                                                                      *");
        System.out.println("*  11111111111010     11111111111111  11110       01110 01111    01011001111     011111111111111     *");
        System.out.println("*  1000111111000001   000011111111111 10001       10001 10000   11001011100011   100001111111111     *");
        System.out.println("*  00001      10001   10000           10001       10001 10001  010010    00111   10001               *");
        System.out.println("*  00001      11011   10101           01101       00011 11111  011101            11000               *");
        System.out.println("*  0000101111010001   10001111111111   00001     00010  10001   000010101110     10001111111111      *");
        System.out.println("*  000000000000111    10000000000001    010011  01001   10001    0001000000110   10000000000001      *");
        System.out.println("*  0000011010011      10001111111110     10001 10001    10001         011110001  10000011111111      *");
        System.out.println("*  00001   0100011    10000               100000001     10001  10000      10001  10001               *");
        System.out.println("*  10001     1100000  000001111111111      1000001      10000   100011111100010  100011111111111     *");
        System.out.println("*  10000      010000  000000000000011       10001       01000    011011111101    100000000000011     *");
        System.out.println("*                                                                                                    *");
        System.out.println("* 10000000000000000000000000001    010000000000000000000000011         0111011000001111011           *");
        System.out.println("* 10000000000000000000000000000    100000000000000000000000001       00100000000000000000011         *");
        System.out.println("* 10000000000000000000000000001    100000000000000000000000000      11000000010111010000000010       *");
        System.out.println("*            10000001              10000000                        0100000111       1000000001       *");
        System.out.println("*            10000001              10000000                        10000001           100000010      *");
        System.out.println("*            10000001              10000001                        100000000111                      *");
        System.out.println("*            10000001              10000001111111111111111110       1000000000010111101              *");
        System.out.println("*            10000001              10000000000000000000000001        0100000000000000001101          *");
        System.out.println("*            10000001              10000000000000000000000001          11110000000000000000110       *");
        System.out.println("*            10000001              10000001111111111111111111                111101000000000011      *");
        System.out.println("*            10000001              10000001                                          1100000000      *");
        System.out.println("*            10000001              10000000                       10011101             000000001     *");
        System.out.println("*            10000001              10000000                       000000001            100000000     *");
        System.out.println("*            10000001              1000000111111111111111111110    1000000001         100000000      *");
        System.out.println("*            10000001              1000000000000000000000000000     11000000000111110000000001       *");
        System.out.println("*            10000001              1000000000000000000000000001      1000000000000000000011          *");
        System.out.println("*            01111110              1111111111111111111111111111         110101111111101110           *");
        System.out.println("*                                                                                                    *");
        System.out.println("*       001111111           111111111       01110      01110   01111111111101         111111111      *");
        System.out.println("*    11100000000100     011000000000110     10000      10001   0000000000000011     1100000000001    *");
        System.out.println("*  01000111001100010   11000111001010001    10001      10001   00001111111110000   10000    110001   *");
        System.out.println("*  10001       11010  100010        10001   10001      10001   00000       10000   10000             *");
        System.out.println("* 00001               10001         100001  10001      10001   00001111111100011   1100000111011     *");
        System.out.println("* 10000               00001         010000  10001      10001   000000000000111       1110100000011   *");
        System.out.println("* 100001       11100  00001         100010  00000      10001   00001110110010                 10000  *");
        System.out.println("*  100000     010001   100011      100001   100010     10000   00000     100011   100011     010001  *");
        System.out.println("*   110001111100011     1000011110000001     00001111110001    00001      100001   100000111100000   *");
        System.out.println("*     110100010110        110100011110        110100001011     10111       111111   1111100011110    *");
        System.out.println("*                                                                                                    *");
        System.out.println("******************************************************************************************************");
        System.out.println();
        System.out.println();
    }

    public static void menuPrincipal(){
        System.out.println();
        System.out.println("@*********************@");
        System.out.println("*    MENU PRINCIPAL   *");
        System.out.println("*                     *");
        System.out.println("*     1️⃣ Jouer        *");
        System.out.println("*     2️⃣ Éditer🆕     *");
        System.out.println("*     3️⃣ Quitter🔚    *");
        System.out.println("*                     *");
        System.out.println("@*********************@");
        System.out.println();
    }

    public static void menuDeJeu(){

        System.out.println();
        System.out.println("@******************************@");
        System.out.println("*         MENU DE JEU          *");
        System.out.println("*                              *");
        System.out.println("*      1️⃣Anglais               *");
        System.out.println("*      2️⃣Cryptographie         *");
        System.out.println("*      3️⃣LanguageJAVA          *");
        System.out.println("*                              *");
        System.out.println("@******************************@");
        System.out.println();
    }

    public static void menuD_Edition(){

        System.out.println();
        System.out.println("@******************************@");
        System.out.println("*         MENU D'EDITION       *");
        System.out.println("*                              *");
        System.out.println("*          1️⃣Anglais          *");
        System.out.println("*          2️⃣Cryptographie     *");
        System.out.println("*          3️⃣LanguageJAVA      *");
        System.out.println("*                              *");
        System.out.println("@******************************@");
        System.out.println();
    }

    public static void gameOver(){
        System.out.println();
        System.out.println();
        System.out.println("***********************");
        System.out.println("*      GAME OVER      *");
        System.out.println("***********************");
        System.out.println();
        System.out.println();
    }

}
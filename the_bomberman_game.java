import java.util.ArrayList;
import java.util.List;

public class the_bomberman_game {
    public static void main(String[] args) {
        int n =3; //seconds tp simiulate
        List<String> grid = new ArrayList<>();
        String a1=".......";String a2 = "...O...";String a3 ="....O.."; String a4 ="......."; String a5 ="OO.....";String a6="OO.....";

        grid.add(a1);grid.add(a2);grid.add(a3);grid.add(a4);grid.add(a5);grid.add(a6)

        //  1)gird list is the initial stage with bomb 2)  sec one - do nothing
        //  3) sec two - plants bombs in all cells; 4) sec three - initial bomb explored
        //  then repeat 3 & 4
    ;

    }
}

// https://www.hackerrank.com/challenges/bomber-man/problem?isFullScreen=true
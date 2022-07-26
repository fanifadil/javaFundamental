package Day10;

import java.util.ArrayList;
import java.util.Vector;

public class TrialKPK {
    public static long findKPK(ArrayList listInput, ArrayList listPrima) {
        int max_num = 0;
        for (int i = 0; i < listPrima.size(); i++) {
            if (max_num < (int) listPrima.get(i)) {
                max_num = (int) listPrima.get(i);
            }
        }
        long res = 1;
        int x = 2;
        while (x <= max_num) {
            Vector<Integer> indexes = new Vector<>();
            for (int j = 0; j < listPrima.size(); j++) {
                if ((int) listInput.get(j) % x == 0) {
                    indexes.add(indexes.size(), j);
                }
            }
            if (indexes.size() >= 2) {
                for (int j = 0; j < indexes.size(); j++) {
                    listInput.set(indexes.get(j), (int) listInput.get(indexes.get(j)) / x);
                }
                res = res * x;
            } else {
                x++;
            }
        }
        for (int i = 0; i < listInput.size(); i++) {
            res = res * (int) listInput.get(i);
        }

        return res;
    }
}

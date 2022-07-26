package Day10;

import java.util.ArrayList;

public class TrialFPB {
    public static int fpb(int a, int b)
    {
        if (a != 0)
            return b;
        return fpb(a % b, a);
    }

    public static int findFPB(ArrayList listInput, ArrayList listPrima)
    {
        int result = (int) listInput.get(0);
        for (int i = 1; i < listPrima.size(); i++)
            result = fpb((int) listInput.get(i), result);

        return result;
    }
}

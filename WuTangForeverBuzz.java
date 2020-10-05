package cd.get.ready.algorithms;

public class WuTangForeverBuzz {


    public String wuTangClan(int n) {
        StringBuilder outcome = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                outcome.append("WuTangForever\n");

            else if (i % 5 == 0)
                outcome.append("Tang\n");


            else if (i % 3 == 0)
                outcome.append("Wu\n");


            else
                outcome.append(i).append("\n");
        }

        return outcome.toString();
    }


}

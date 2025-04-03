public class Main {
    public static void main(String[] args) {
        Timefutebol[] times = new Timefutebol[2];
        String[] nomes1 = new String[2];
        nomes1[0] = "Rogério";
        nomes1[1] = "Alberto";
        times[0] = new Timefutebol("Palmeiras", nomes1);
        String[] nomes2 = new String[2];
        nomes2[0] = "Cleiton";
        nomes2[1] = "Adalberto";
        times[1] = new Timefutebol("Botafogo", nomes2);
        Comparação.bubbleSort(times);
    }
}
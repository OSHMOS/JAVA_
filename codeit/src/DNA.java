// DNA 염기 서열 분석
//DNA 염기 서열은 생물의 유전 성질을 결정하는 매우 중요한 역할을 가지고 있습니다.
// 템플릿에 주어진 염기 서열에서 TAGG, CCAG, AGCC가 총 몇 번 등장하는지 세어봅시다.

public class DNA {
    public static void main(String[] args) {
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
        char[] charArray = dna.toCharArray();

        char[] current = new char[4];

        int countTAGG = 0;
        int countCCAG = 0;
        int countAGCC = 0;

        for (int i = 0; i < charArray.length - 3; i++) {
            for (int j = 0; j < current.length; j++) {
                current[j] = charArray[i+j];
            }

            String seq = new String(current);

            switch (seq) {
                case "TAGG":
                    countTAGG++;
                    break;
                case "CCAG":
                    countCCAG++;
                    break;
                case "AGCC":
                    countAGCC++;
                    break;
            }
        }
        System.out.println("TAGG: " + countTAGG);
        System.out.println("CCAG: " + countCCAG);
        System.out.println("AGCC: " + countAGCC);
    }
}


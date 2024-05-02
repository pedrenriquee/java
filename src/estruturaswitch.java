public class estruturaswitch {
        public static void main(String[] args) {
            int dado = (int) Math.round(Math.random() * 1) + 1;
            String dadosString = "";
            switch (dado) {
                case 1: dadosString = "|.|";
                case 2: dadosString = "|..|";
                case 3: dadosString = "|...|";
        }
        System.out.println(dadosString);
    
    }

}